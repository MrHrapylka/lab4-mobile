package com.example.lab4_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name = intent.getStringExtra("name")
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Привет, $name!"
    }
}