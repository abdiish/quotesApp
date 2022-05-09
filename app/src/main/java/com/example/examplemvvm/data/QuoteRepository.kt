package com.example.examplemvvm.data

import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider
import com.example.examplemvvm.data.network.QuoteService
import javax.inject.Inject

// La clase se encarga de ir a la BD o Internet
class QuoteRepository @Inject constructor( private val api: QuoteService ){

    //private val api = QuoteService() // Instancia del servicio

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}