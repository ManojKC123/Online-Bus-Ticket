package com.manoj.guitarhero.api

import com.manoj.guitarhero.response.AllProductsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface ProductAPI {

    //get all students
    @GET("/product/fetch")
    suspend fun getAllProducts(
            @Header("Authorization") token : String,
    ): Response<AllProductsResponse>
}