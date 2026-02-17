package com.example.appretrofit.data.repository

import com.example.appretrofit.data.model.ProductDto
import com.example.appretrofit.data.remote.ProductsApi

class ProductsRepository(
    private val api: ProductsApi
) {

    suspend fun getProducts(): List<ProductDto> = api.getProducts().results

}