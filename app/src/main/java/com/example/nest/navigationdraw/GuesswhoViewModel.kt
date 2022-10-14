package com.example.nest.navigationdraw

import androidx.lifecycle.*
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nest.model.Bird

class GuesswhoViewModel : ViewModel() {
    private val _textNameBird = MutableLiveData<String>()
    val textNameBird : LiveData<String>
    get() = _textNameBird

    init {
        _textNameBird.value = ""
    }
}