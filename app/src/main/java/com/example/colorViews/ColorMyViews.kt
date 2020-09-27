package com.example.colorViews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.diceroller.R
import kotlinx.android.synthetic.main.activity_color_my_views.*

class ColorMyViews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_my_views)
        setListeners();
    }

    fun setListeners() {

        val clicableViews: List<View> =
            listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text);
        for (item in clicableViews) {
            item.setOnClickListener {
                makeColoreView(it);
            }
        }
    }

    fun makeColoreView(view: View) {

        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY);
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY);
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light);
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_purple);
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_dark);
        }
    }
}