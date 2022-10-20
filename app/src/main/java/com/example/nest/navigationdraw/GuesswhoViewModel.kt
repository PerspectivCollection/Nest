package com.example.nest.navigationdraw

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GuesswhoViewModel : ViewModel() {
//    private val _textbird = MutableLiveData<String>()

    val textbird = MutableLiveData<String>()
//        get() = _textbird

    init {
        textbird.value = "som val start"
    }


//    fun showbird() {
//        textbird.value = "bird.name"
//    }
}