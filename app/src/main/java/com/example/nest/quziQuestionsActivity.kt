package com.example.nest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class quziQuestionsActivity : AppCompatActivity() {

    private var mCurrentPosition: Int =1
    private var mqustionList: ArrayList<Question>? = null
    private var mseletionOptionPosition: Int  = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quzi_questions)


        mqustionList = Constanst.getQuestion()
        setQuestion()

        duck_option_one.setOnClickListener(this)
    }
}