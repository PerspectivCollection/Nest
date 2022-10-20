package com.example.nest.screensAll.guesswho

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FactViewModel : ViewModel() {

    var textbird : String = ""

    val indexBird = MutableLiveData<Int>()


     fun addNewBird() {
         indexBird.value = indexBird.value?.plus(1)

    }
//    android:onClick="@{() ->  updateBird.addNewBird()}"

    init {
        indexBird.value = 0
        addNewBird()
    }
}