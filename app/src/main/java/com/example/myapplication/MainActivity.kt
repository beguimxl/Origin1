package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var java: Int = 0
    var net: Int = 0
    var database: Int = 0

    var total: Int = 0
    var ave: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTotal.setOnClickListener {
            java = editTextJava.text.toString().toInt()
            net = editTextNetwork.text.toString().toInt()
            database = editTextDatabase.text.toString().toInt()
            total = java + net + database
            tvTotal.text = total.toString()
        }

        buttonAve.setOnClickListener {

            ave = total / 3
            tvAve.text = ave.toString()

            when {
                ave >= 90 -> tvGrade.text = "A"
                ave >= 80 -> tvGrade.text = "B"
                ave >= 70 -> tvGrade.text = "C"
                ave >= 60 -> tvGrade.text = "D"
                else -> tvGrade.text = "F"
            }

        }
    }
}