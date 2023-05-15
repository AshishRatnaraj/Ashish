package com.example.ashishproject

class Student(name:String, age:Byte,var classlevel:Int):Person(name,age) {


 fun movetonextclass(){
     classlevel = classlevel+1


 }

}