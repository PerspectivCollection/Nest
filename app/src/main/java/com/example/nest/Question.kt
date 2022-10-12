package com.example.nest

data class Question(

    val id: Int,
    val question:String,
    val image:Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFoure: String,
    val corretOption: Int
)