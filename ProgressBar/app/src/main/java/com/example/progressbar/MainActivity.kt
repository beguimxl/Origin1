package com.example.progressbar

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), HomeFragment.OnFragmentInteractionListener {
    override fun onStartProgressBar() {
        Toast.makeText(this, "Start", Toast.LENGTH_LONG).show()
        progressBar.visibility = View.VISIBLE
    }

    override fun onStopProgressBar() {
       progressBar.visibility = View.GONE
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

               // message.setText(R.string.title_home)
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainLayout, HomeFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
               // message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
              //  message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     //   val navView: BottomNavigationView = findViewById(R.id.nav_view)

        nav_view.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
