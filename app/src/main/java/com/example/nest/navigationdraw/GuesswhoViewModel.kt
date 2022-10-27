package com.example.nest.navigationdraw

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nest.model.Bird

class GuesswhoViewModel : ViewModel() {

    val lsitsetused = mutableListOf(1, 4, 5, 5, 5)

//    private lateinit var listrandombird: MutableLiveData<Bird>

    private val _curentBird = MutableLiveData<Bird>()
    val currentBird: LiveData<Bird>
        get() = _curentBird

    //som true or fals value
    private val _selectionDone = MutableLiveData<Boolean>()
    val selectionDone: LiveData<Boolean>
        get() = _selectionDone


    var indexBird = 0


    //    private val _textbird = MutableLiveData<String>()
    val textbird = MutableLiveData<String>()
//        get() = _textbird

    var removeIndexFalse = false

    init {
        textbird.value = "som val start"

        indexBird = 0


//        whenNext()

        removeIndexFalse

        lsitsetused

    }

    //todo cahge arg to bool insted of list, for the next button
    fun whenNext() {
//        if (lsitsetused.isNotEmpty()) //input from privius fragment
//            addBird()
        ++indexBird
    }

    fun addBird() {
        lsitsetused.add(1233)
    }

//    fun showbird() {
//        textbird.value = "bird.name"
//    }
}
