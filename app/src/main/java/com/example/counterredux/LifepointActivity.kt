package com.example.counterredux

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LifepointActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifepoint)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)


    }
}