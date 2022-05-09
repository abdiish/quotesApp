package com.example.examplemvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider
import com.example.examplemvvm.domain.GetQuotesUseCase
import com.example.examplemvvm.domain.GetRandomQuoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

// La clase extiende de ViewModel
@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val getRandomQuoteUseCase: GetRandomQuoteUseCase,
    private val getQuotesUseCase: GetQuotesUseCase
): ViewModel() {
    // Se encapsula el modelo en un MutableLiveData
    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

//    var getQuoteUsecase = GetQuotesUseCase()
//    var getRandomQuoteUseCase = GetRandomQuoteUseCase()

    fun onCreate() {
        // realizar llamada a caso de uso
        // Nos devolvera quotes y las almacenara en memoria
        // viewModelScope permite crear una corutina
        viewModelScope.launch {
            isLoading.postValue(true) // Muestra progressbar
            val result:List<QuoteModel>? = getQuoteUsecase()
            // Si no es null o vacio
            if (!result.isNullOrEmpty()) {
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    //QuoteProvider es el listado
    fun randomQuote() {
        // val currentQuote = QuoteProvider.random()
        // Cambiar valor a través de postValue
        // quoteModel.postValue(currentQuote)

        // caso de uso, llamar cita random
        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase()
        if (quote != null) {
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }


}