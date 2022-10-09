package com.example.nest.screensQuiz.guesswho

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GuessWhoViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    val some_string = MutableLiveData<Int>()

    init {
        some_string.value = 0
    }
}