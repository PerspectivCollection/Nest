package com.example.nest.navigationNotNow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nest.Question
import com.example.nest.R

class quziQuestionsActivity : AppCompatActivity() {

    private var mCurrentPosition: Int = 1
    private var mqustionList: ArrayList<Question>? = null
    private var mseletionOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quzi_questions)


//        mqustionList = Constanst.getQuestion()
//        setQuestion()
//
//        duck_option_one.setOnClickListener(this)
    }
}