package com.androidapp.hellokotlin427

import android.icu.text.SimpleDateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {

    var clickCount = 0
    var startTime = System.currentTimeMillis()
    var elapsedSeconds : Long = ((System.currentTimeMillis() - startTime)/ 1000.0).toLong()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val txtElapsedTime = findViewById<TextView>(R.id.txtElapsedTime)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)

        btnClickMe.setOnClickListener {
            clickCount ++
            txtCountBtnClicks.text = "Button clicks : ${clickCount}" //("Button clicks: " + clickCount)
            txtElapsedTime.text = "${elapsedSeconds} seconds elapsed"
        }
        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREAN).format(startTime)
        txtActivityStartTime.text = "Activity start time = ${timeText}"
    }
}