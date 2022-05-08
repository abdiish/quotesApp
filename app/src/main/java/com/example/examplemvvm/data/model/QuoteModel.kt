package com.example.examplemvvm.data.model

import com.google.gson.annotations.SerializedName

// Create data class (modelo de datos)
// Model recupera información de Retrofit, fichero, etc

// SerializeName, indica que debe serializarse en JSON con el valor de nombre proporcionado
// como su nombre de campo

data class QuoteModel(
    @SerializedName("quote") val quote: String,
    @SerializedName("author") val author: String
    )