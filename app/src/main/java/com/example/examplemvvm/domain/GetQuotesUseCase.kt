package com.example.examplemvvm.domain

import com.example.examplemvvm.data.QuoteRepository
import com.example.examplemvvm.data.model.QuoteModel
import javax.inject.Inject

// Capa dominio se almacena toda la lógica de negocio

class GetQuotesUseCase @Inject constructor( private val repository: QuoteRepository) {

    // Caso de uso, llama al repositorio para decir que recupere todas las citas de Internet
    // private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()


}