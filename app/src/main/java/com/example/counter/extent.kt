package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.addFragment(fragment: Fragment){
    supportFragmentManager.beginTransaction().add(R.id.conteyner,fragment).commit()
}