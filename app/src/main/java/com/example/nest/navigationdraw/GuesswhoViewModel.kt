package com.example.nest.navigationdraw

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nest.model.Bird

class GuesswhoViewModel : ViewModel() {
    private val _quantity = MutableLiveData<Int>()
    val quantity: LiveData<Int> = _quantity

    fun setQuantity(numberCupcakes: Int) {
        _quantity.value = numberCupcakes
        updateIndexGuess()
    }

    fun updateIndexGuess(){
        quantity.value?.plus(1)

    }


    //todo var proggres
    //todo var indexbird
    //todo var next bird
    //todo fun random bird
    //todo fun  default value resetBird list
}
