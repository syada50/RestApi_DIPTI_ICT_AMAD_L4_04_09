package com.example.restapi_dipti_ict_amad_l4_04_09

import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProducts():List<Product_DIPTI_ICT_AMAD_L4_04_09>
}