package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
    }
    fun init():Unit{
        val roll_btn: Button = findViewById(R.id.btn_roll)
        roll_btn.text = "Let's Roll"
    }
}
