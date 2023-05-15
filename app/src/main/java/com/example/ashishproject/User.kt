package com.example.ashishproject

import android.os.strictmode.CredentialProtectedWhileLockedViolation
import android.util.Log

open class User (
    val username:String,
    var password:String,
    var email:String,

    var locked:Boolean
 ) {
    fun LogUserInfo() {
        Log.i("User","username,$username\nEmail:$email")
    }

    fun lock() {
        locked = true
    }

    fun unlock() {
        locked = false
    }

    fun setPassword(newpassword: String) {
        password = newpassword
    }
}















