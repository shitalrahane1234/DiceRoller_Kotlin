package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

 class MainActivity : AppCompatActivity() {
    lateinit var iv_dice:ImageView;
    lateinit var roll_btn: Button ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init();
    }
    fun init():Unit{

        roll_btn= findViewById(R.id.btn_roll)
        iv_dice = findViewById(R.id.iv_dice);
        roll_btn.text = "Let's Roll"
        roll_btn.setOnClickListener(){
            rollDice();
        }
    }
    fun rollDice():Unit{
        var result = Random().nextInt(6)+1
        var drawableres = when(result){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        iv_dice.setImageResource(drawableres);
    }
}
