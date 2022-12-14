package com.example.nest.navigationdraw

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AudioquizViewModel : ViewModel() {
    private val _birdindex = MutableLiveData<Int>()
    val birdindex: LiveData<Int>
        get() = _birdindex

    private val _progressguess = MutableLiveData<Int>()
    val progressguess: LiveData<Int>
        get() = _progressguess


    private val _typebird = MutableLiveData<Boolean>()
    val typebird: LiveData<Boolean>
        get() = _typebird

    val storeList = mutableListOf<Int>()

    private val _storCorrect = MutableLiveData<Int>()
    val storCorrect: LiveData<Int>
        get() = _storCorrect


    init {
    }

    fun setGuessBird(index: Int) {
        _birdindex.value = index
    }

    fun progreebarstart(index: Int) {
        _progressguess.value = index
    }

    fun resetProgress(){
        storeList.removeAll(storeList)
        _progressguess.value = 0
    }

    fun rigthGuess(){
        _typebird.value = true
    }

    fun resetGuess(){
        _typebird.value = false
    }

    fun storeAudiGuess(num : Int){
        storeList.add(num)
    }
}