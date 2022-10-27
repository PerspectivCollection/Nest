package com.example.nest.screensAll.guesswho

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FactViewModel : ViewModel() {

    val lsitsetused : MutableList<Int>  = mutableListOf()

    var textbird : String = ""

    var typeBird : Boolean = false

    val removeIndexFalse = MutableLiveData<Boolean>()

//    android:onClick="@{() ->  updateBird.addNewBird()}"


    init {
        removeIndexFalse.value = true
        addNewBird()
    }

    //todo impliment randomBird() and removeBirdFrom() list

    fun addNewBird() {
//        indexBird.value = indexBird.value?.plus(1)
    }

    //todo inplement end of gueee who
    fun endOfGuesswho(){

    }

    fun skowCorectColor(){

    }


}