package com.example.firstappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.*


class MainActivity : AppCompatActivity() {

    //Esto es como un main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<AppCompatEditText>(R.id.eTName)



        val btnStart = findViewById<AppCompatButton>(R.id.first_btn)
        btnStart.setOnClickListener {
            val name = editText.text.toString()
            if (name.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }

        }

    }


}