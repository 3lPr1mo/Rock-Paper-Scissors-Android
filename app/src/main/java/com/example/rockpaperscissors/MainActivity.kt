package com.example.rockpaperscissors

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var btnPlay: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlay = findViewById(R.id.btnPlay)

        btnPlay.setOnClickListener{
            val context = btnPlay.context
            startGame(context)
        }
    }
}

fun startGame(context:Context){
    val intent = Intent(context,GameActivity::class.java).apply {  }
    context.startActivity(intent)
}