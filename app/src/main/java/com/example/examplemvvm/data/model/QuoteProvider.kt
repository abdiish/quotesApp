package com.example.examplemvvm.data.model

// Clase que nos devuelve citas de forma random, emulando a Room o Retrofit

class QuoteProvider {

    // Companion object para poder acceder a través de un método
    companion object {

        // Método para acceder
//        fun random(): QuoteModel {
//            val position = (0..9).random()
//            return quote[position]
//        }

//        private val quote = listOf<QuoteModel>(
//            QuoteModel( quote = "Frase 1", author = "Autor 1"),
//            QuoteModel( quote = "Frase 2", author = "Autor 2"),
//            QuoteModel( quote = "Frase 3", author = "Autor 3"),
//            QuoteModel( quote = "Frase 4", author = "Autor 4"),
//            QuoteModel( quote = "Frase 5", author = "Autor 5"),
//            QuoteModel( quote = "Frase 6", author = "Autor 6"),
//            QuoteModel( quote = "Frase 7", author = "Autor 7"),
//            QuoteModel( quote = "Frase 8", author = "Autor 8"),
//            QuoteModel( quote = "Frase 9", author = "Autor 9"),
//            QuoteModel( quote = "Frase 10", author = "Autor 10"),
//
//            )

        var quotes: List<QuoteModel> = emptyList()
    }


}