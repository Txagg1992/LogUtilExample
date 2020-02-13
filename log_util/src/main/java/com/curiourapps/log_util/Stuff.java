package com.curiourapps.log_util;

import android.util.Log;

public class Stuff {

    private static final String TAG = "Awesomness";

    public static void d(String message){
        Log.d(TAG, message);
    }
}