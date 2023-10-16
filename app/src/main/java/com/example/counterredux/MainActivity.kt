package com.example.counterredux

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val matchActivityButton = findViewById<Button>(R.id.Button_Match)
        matchActivityButton.setOnClickListener {
            val Intent = Intent(this,MatchActivity::class.java)
            startActivity(Intent)
        }

    }
}