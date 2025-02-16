package com.daylab.superapp

import android.app.Application
import com.daylab.utilities.logging.AppLogger
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppLogger.d(message = "Launched Application");
    }
}