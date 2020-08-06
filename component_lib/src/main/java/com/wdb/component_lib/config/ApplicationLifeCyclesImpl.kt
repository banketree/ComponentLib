package com.wdb.component_lib.config

import android.app.Application
import android.content.Context
import com.wdb.component_lib.core.AppLifeCycles

internal class ApplicationLifeCyclesImpl : AppLifeCycles {
    override fun attachBaseContext(base: Context) {
    }

    override fun onCreate(application: Application) {
    }

    override fun onTerminate(application: Application) {
    }
}