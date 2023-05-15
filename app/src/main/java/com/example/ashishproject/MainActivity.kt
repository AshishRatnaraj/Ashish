package com.example.ashishproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun getCircleArea(side1:Int,side2:Int) {
            val Area = side1*side2
            Log.i("DEMO", Area.toString())

        val names = listOf("ashish","Abhinav","Martin",)
        val cities= listOf("Dehradun","Delhi","Chennai")
        val movies = listOf("Superman","Spiderman","Batman")

        val area = getCircleArea(1.0)
        Log.i("DEMO","The area of the circle \nwith a 1.0 radius is $area")
        val area1 = getCircleArea(3.6)
        Log.i("DEMO","The area of the circle \nwith a 3.6 radius is $area")
        val area2 = getCircleArea(10)
        Log.i("DEMO","The area of the circle \nwith a 10 radius is $area")

        printList(names)
        printList(cities)
        printList(movies)




