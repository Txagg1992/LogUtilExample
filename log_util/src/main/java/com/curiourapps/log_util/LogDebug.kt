package com.curiourapps.log_util

import android.util.Log

class LogDebug {

    private val TAG :String = "*Awesomeness*"

    fun d(message: String){
        Log.d(TAG, message)
    }
}