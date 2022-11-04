package com.example.nest.navigationdraw

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GuesswhoViewModel : ViewModel() {
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


    init {
//        _typebird.value = false
    }

    fun setGuessBird(index: Int) {
        _birdindex.value = index
    }

    //adds elment to end of list
    fun updateIndexGuess() {
        var store = (0..33).random() //there is 1 , rmember to have -1 less then the list length
        _birdindex.value = store
        storeList.add(store)
    }

    fun progreebarstart(index: Int) {
        _progressguess.value = index
    }

    fun progreebar(addprogres: Int) {
        _progressguess.value = addprogres.plus(20)
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

}
