package com.example.nest.navigationdraw

import android.util.Log
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


    fun setGuessBird(index: Int) {
        _birdindex.value = index
    }

    //adds elment to end of list
    fun updateIndexGuess() {
        var store = (0..4).random() //todo set 4 to round 20
        _birdindex.value = store
        storeList.add(store)
        Log.i(storeList.toString(), "dsom")
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
}
