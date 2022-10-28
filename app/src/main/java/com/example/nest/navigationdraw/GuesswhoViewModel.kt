package com.example.nest.navigationdraw

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nest.model.Bird

class GuesswhoViewModel : ViewModel() {
    private val _quantity = MutableLiveData<Int>()
    val quantity: LiveData<Int>
    get() = _quantity

//    fun setQuantity(index: Int) {
//        _quantity.value = index.plus(1)
////        updateIndexGuess()
//    }
    fun setQuantity(index: Int) {
        _quantity.value = index
//        updateIndexGuess()
    }

    fun resetquantety(){
        _quantity.value = 0
    }

    fun updateIndexGuess(addinx : Int){
        _quantity.value =addinx.plus(1)

    }


    //todo var proggres
    //todo var indexbird
    //todo var next bird
    //todo fun random bird
    //todo fun  default value resetBird list
}
