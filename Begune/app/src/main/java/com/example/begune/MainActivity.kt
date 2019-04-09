package com.example.begune

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var color : Int = 0
        btnColor.setOnClickListener{
                if(color==2) color=0
                color++
                when(color) {

                    1 -> bckGround.setBackgroundColor(Color.GREEN)
                    2 -> bckGround.setBackgroundColor(Color.RED)
                }
            }
        }
    }

