package com.example.appretrofit.data.remote

import com.example.appretrofit.data.model.ProductResponse
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): ProductResponse
}