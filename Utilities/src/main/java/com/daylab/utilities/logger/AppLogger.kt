package com.daylab.utilities.logging

import android.util.Log
import com.daylab.utilities.BuildConfig

object AppLogger {
    const val TAG = "AppLogger"
    fun d(tag:String = TAG, message:String){
        if (BuildConfig.DEBUG){
            Log.d(tag,message)
        }
    }

    fun e(tag:String = TAG, message:String){
        if(BuildConfig.DEBUG){
            Log.e(tag,message)
        }
    }
}