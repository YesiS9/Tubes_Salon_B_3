package com.example.tubes_salon_b_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    lateinit var menu : Menu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//
    fun changeFragment(fragment: Fragment?) {
        if (fragment != null) {
            getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit()
        }
    }
}

