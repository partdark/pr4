package com.example.pr3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sButton : Button = findViewById(R.id.standartButton)
        val bigButton : Button = findViewById(R.id.bigButton)
        val smallButton : Button = findViewById(R.id.smallButton)
        val textView : TextView = findViewById(R.id.textView)

        sButton.setOnClickListener {
            textView.textSize = 14F
        }
        smallButton.setOnClickListener {
            textView.textSize = 10F
        }
        bigButton.setOnClickListener {
            textView.textSize = 28F
        }
    }
}