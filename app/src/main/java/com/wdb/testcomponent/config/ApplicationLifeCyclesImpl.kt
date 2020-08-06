package com.wdb.testcomponent.config

import android.app.Application
import android.content.Context
import android.util.Log
import com.wdb.component_lib.core.AppLifeCycles

internal class ApplicationLifeCyclesImpl : AppLifeCycles {
    override fun attachBaseContext(base: Context) {
        Log.i("", "attachBaseContext")
    }

    override fun onCreate(application: Application) {
        Log.i("", "onCreate")
    }

    override fun onTerminate(application: Application) {
        Log.i("", "onTerminate")
    }
}