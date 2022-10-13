package com.example.nest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_guess.*

class NameQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guess)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        start_btn.setOnClickListener{
            if(name.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter your name ", Toast.LENGTH_SHORT).show()
            }
            else{
                val intet = Intent(this,QuestionsActivity::class.java)
                startActivity(intet)
                finish()
            }



        }
    }
}