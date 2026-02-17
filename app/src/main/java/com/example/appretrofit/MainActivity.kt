package com.example.appretrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appretrofit.presentation.viewmodel.ProductsViewModel
import com.example.appretrofit.ui.screens.ProductsScreen
import com.example.appretrofit.ui.theme.AppRetrofitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppRetrofitTheme {
                Surface {
                    val vm: ProductsViewModel = viewModel()
                    ProductsScreen(vm)
                }
            }
        }
    }
}