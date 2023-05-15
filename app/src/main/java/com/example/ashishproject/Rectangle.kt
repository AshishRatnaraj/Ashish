package com.example.ashishproject

import android.util.Log

class Rectangle (
    val side1 : Int,
    val side2 : Int,
    ) {
    fun getArea() {
        val Area = side1 * side2
        Log.i("DEMO", "$Area")
    }
    fun Logside(){
        Log.i("DEMO","side is $side1\nside2 is $side2")
    }
}