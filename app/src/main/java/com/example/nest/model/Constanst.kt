package com.example.nest.model

import com.example.nest.R
import com.example.nest.model.Question

object Constanst {
    fun getQuestion(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "What is the name of the goose?",
            R.mipmap.northern_pintall,
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            3
        )
        questionList.add(question1)
        val question2 = Question(
            2,

            "What is the name of the goose?",
            R.mipmap.american_wigeon,
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            1
        )
        questionList.add(question2)
        val question3 = Question(
            3,
            "What is the name of the goose?",
            R.mipmap.northern_pintall,
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            3
        )
        questionList.add(question3)
        val question4 = Question(
            4,
            "What is the name of the goose?",
            R.mipmap.mandarin_duck,
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            4
        )
        questionList.add(question4)
        val question5 = Question(
            5,
            "What is the name of the goose?",
            R.mipmap.wood_duck,
            "American Wigeon",

            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            2
        )
        questionList.add(question5)
        val question6 = Question(
            6,
            "What is the name of the goose?",
            R.mipmap.mandarin_duck,
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            4
        )
        questionList.add(question6)
        val question7 = Question(
            7,
            "What is the name of the goose?",
            R.mipmap.mandarin_duck,
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            4
        )
        questionList.add(question7)
        val question8 = Question(
            1,
            "What is the name of the goose?",
            R.mipmap.northern_pintall,
            "American Wigeon",
            "Wood Duck",
            "Northern Pintall",
            "Mandarin Duck",
            3
        )
        questionList.add(question8)
        val question9 = Question(
            8,
            "What is the name of the goose?",
            R.mipmap.mandarin_duck,
            "Wood Duck", "Northern Pintall",
            "Mandarin Duck", "Mandarin Duck",4
        )
        questionList.add(question9)
        return questionList
    }

}