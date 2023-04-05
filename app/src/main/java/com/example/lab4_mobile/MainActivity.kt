package com.example.lab4_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            val name = findViewById<EditText>(R.id.editText).text.toString()
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}