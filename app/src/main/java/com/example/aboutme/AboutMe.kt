package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.diceroller.R
import com.example.diceroller.databinding.ActivityAboutMeBinding
import kotlinx.android.synthetic.main.activity_about_me.*

class AboutMe : AppCompatActivity() {
    private  lateinit var binding:ActivityAboutMeBinding;
    var myname:Myname = Myname("Shital")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        supportActionBar!!.title = "About me"
        init();
    }
    fun init():Unit{
        binding = DataBindingUtil.setContentView(this,R.layout.activity_about_me);
        binding.getname = myname;
        binding.btnDone.setOnClickListener(){
            addNickName(it);
        }

    }
    fun addNickName(v:View){


        binding.apply {
            getname?.nickname = etNickname.text.toString();
            invalidateAll()
            etNickname.visibility = View.GONE;
            v.visibility = View.GONE;
            btnDone.visibility = View.GONE;
            tvNickname.visibility = View.VISIBLE;

        }

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(v.windowToken,0)
    }

}