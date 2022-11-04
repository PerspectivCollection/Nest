package com.example.nest.screensall.namequiz

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nest.R


class ShareFragment : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.fragment_namequiz)

        val btn = findViewById<Button>(R.id.share_btn)
        btn.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent(ACTION_VIEW, Uri.parse("https://www.facebook.com")),)
            startActivity(intent)

        })

 }
}