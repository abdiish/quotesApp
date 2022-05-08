package com.example.examplemvvm.data.network

import com.example.examplemvvm.core.RetrofitHelper
import com.example.examplemvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

// Clase encargada de llmar al repositorio, cuando se requieran datos de Internet
// Gestonara la llamada a Retrofit
class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit() // Instancia de retrofithelper

    suspend fun getQuotes(): List<QuoteModel> { // LLamada a interfaz
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList() // Si es null devuelve lista vacia
        }
    }
}