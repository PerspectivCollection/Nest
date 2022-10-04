package com.example.nest

import android.app.Activity
import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(){

//    private lateinit var binder: Question

//    privete but : <button> = get



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_start = findViewById<Button>(R.id.NameQuiz)

        btn_start.setOnClickListener{
            val intent = Intent(it.context, quziQuestionsActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}