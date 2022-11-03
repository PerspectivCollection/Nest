package com.example.nest.namequiz

import android.media.Image

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFoure: String,
    val corretAns: Int
)