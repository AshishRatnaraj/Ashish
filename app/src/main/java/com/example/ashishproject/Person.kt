package com.example.ashishproject

import android.util.Log

open class Person(
    val name: String,
    var age: Byte,
) {
    fun celebrateBirthday(){
        age++
        Log.i("DEMO","$name is now $age")
    }

    fun speak(){
        Log.i("DEMO","$name is speaking.")
    }
}