package com.example.ashishproject

import java.security.KeyStore.TrustedCertificateEntry

class TrialUser( username:String,
                 password:String,
                 email:String,
                 locked: Boolean
                 ): User(username,password,email,locked) {

    var remainingDaysvalid = 14

    fun TrialExpired():Boolean {
        return remainingDaysvalid>=0
    }
    fun getRemainingTrialDays():Int{
       return remainingDaysvalid
    }
    fun Addday(){}
    fun subtract(){}

}