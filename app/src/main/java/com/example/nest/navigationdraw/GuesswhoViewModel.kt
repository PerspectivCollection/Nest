package com.example.nest.navigationdraw

import android.provider.ContactsContract.RawContacts.Data
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GuesswhoViewModel : ViewModel() {
    private val _birdindex = MutableLiveData<Int>()
    val birdindex: LiveData<Int>
    get() = _birdindex

    private val _progressguess = MutableLiveData<Int>()
    val progressguess : LiveData<Int>
    get() = _progressguess

      val storeList = mutableListOf<Int>()

    fun setGuessBird(index: Int) {
        _birdindex.value = index
    }

    fun updateIndexGuess(){
        var store = (0..20).random()
        _birdindex.value = store
        storeList.add(store)
        Log.i(storeList.toString(), "dsom")
    }

    fun progreebarstart(index: Int){
        _progressguess.value = index
    }

    fun progreebar(addprogres: Int){
        _progressguess.value = addprogres.plus(20)
    }

    //todo fun random bird
    //todo fun  default value resetBird list
}
