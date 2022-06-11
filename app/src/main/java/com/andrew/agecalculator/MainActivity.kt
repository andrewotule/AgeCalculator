package com.andrew.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun BTNClickevent(view:View){
        val DOB = findViewById<EditText>(R.id.etEnterDOB)
        val SHOWAGE = findViewById<TextView>(R.id.tvShowsAgetxt)
        val userDOB:String = DOB.text.toString()  //DOB IS AN INT SO WE CONVERT TO TEXT AND THEN TO STRING
        if (userDOB.toInt() == 0){
            SHOWAGE.text = "Invalid input"
            return
        }
        val year:Int = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = year - userDOB.toInt()
        SHOWAGE.text = "Your age is $myAge"

    }
}