package com.example.appretrofit.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appretrofit.data.model.ProductDto
import com.example.appretrofit.data.remote.ProductsNetwork
import com.example.appretrofit.data.repository.ProductsRepository
import kotlinx.coroutines.launch

class ProductsViewModel : ViewModel() {

    private val repository = ProductsRepository(ProductsNetwork.api)

    var state by mutableStateOf<UiState<List<ProductDto>>>(UiState.Loading)
        private set

    init {
        loadProducts()
    }

    fun loadProducts() {
        viewModelScope.launch {
            state = UiState.Loading
            state = try {
                UiState.Success(repository.getProducts())
            } catch (e: Exception) {
                UiState.Error(e.message ?: "Error cargando productos")
            }
        }
    }
}