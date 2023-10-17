package com.example.counterredux

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MatchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)

        // Navigates back to the homescreen
        val returnActivityButton = findViewById<ImageButton>(R.id.Button_Return)
        returnActivityButton.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }

        // Navigates to lifepoints calculator
        val lifepointsActivityButton = findViewById<Button>(R.id.Button_Lifepoints)
        lifepointsActivityButton.setOnClickListener {
            val Intent = Intent(this,LifepointActivity::class.java)
            startActivity(Intent)
        }
    }
}