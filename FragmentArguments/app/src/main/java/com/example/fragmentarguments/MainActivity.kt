package com.example.fragmentarguments

import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    override fun onFragmentInteraction(uri: Uri) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home-> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.bigboss, TotalFragment())
                    .commit()
            }
            R.id.navigation_dashboard -> {
                //message.setText(R.string.title_dashboard)
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.bigboss, ResultFragment())
                    .commit()

                return@OnNavigationItemSelectedListener true
            }
//            R.id.navigation_notifications -> {
//                //message.setText(R.string.title_notifications)
//                return@OnNavigationItemSelectedListener true
//            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav_view.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
