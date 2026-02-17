package com.example.appretrofit.data.model

import com.squareup.moshi.Json

data class ProductResponse(
    val page: Int,
    val per_page: Int,
    val total: Int,
    val total_pages: Int,

    @Json(name = "results")
    val results: List<ProductDto>
)