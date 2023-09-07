package com.example.firstappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_view)

        val tvResult = findViewById<TextView>(R.id.tvResults)
        val resultName: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola $resultName"
    }
}