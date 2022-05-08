package com.example.examplemvvm.domain

import com.example.examplemvvm.data.QuoteRepository
import com.example.examplemvvm.data.model.QuoteModel

// Capa dominio se almacena toda la lógica de negocio

class GetQuotesUseCase {

    // Caso de uso, llama al repositorio para decir que recupere todas las citas de Internet
    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()


}