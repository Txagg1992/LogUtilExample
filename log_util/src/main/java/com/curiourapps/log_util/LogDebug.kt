package com.curiourapps.log_util

import android.util.Log

class LogDebug {

    companion object{
        val TAG = "Awesomness"

        fun d(message: String?) {
            Log.d(TAG, message)
        }
    }


}