package com.ilker.applicationpt1

import android.app.Application
import timber.log.Timber

class PT1Application : Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}