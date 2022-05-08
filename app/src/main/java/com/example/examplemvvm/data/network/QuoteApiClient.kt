package com.example.examplemvvm.data.network

import com.example.examplemvvm.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

// Capa data, el consumo de API depende de esta
interface QuoteApiClient {
    // Peticion GET que devuelve un listado de QuoteModel
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}