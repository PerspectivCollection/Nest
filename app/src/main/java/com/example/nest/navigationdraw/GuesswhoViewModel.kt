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

    private val _storCorrect = MutableLiveData<Int>()

    val storCorrect : LiveData<Int>
    get() = _storCorrect



    init {
//        _storCorrect.value = 0
    }

    fun setGuessBird(index: Int) {
        _birdindex.value = index
    }

    //adds elment to end of list
    fun updateIndexGuess() {
        val store = (0..20).random() //there is 1 , rmember to have -1 less then the list length
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

    fun addToScoor(index: Int){
        _storCorrect.value = index.plus(1) //todo fix
    }

    fun resetGuess(){
        _typebird.value = false
    }

}
