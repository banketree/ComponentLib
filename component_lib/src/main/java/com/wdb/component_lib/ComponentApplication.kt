package com.wdb.component_lib

import android.app.Application
import android.content.Context
import com.wdb.component_lib.core.AppDelegate

class ComponentApplication {
    private var appDelegate: AppDelegate? = null

    fun onCreate(application: Application) {
        appDelegate?.onCreate(application)
    }

    fun attachBaseContext(base: Context) {
        if (appDelegate == null) {
            appDelegate = AppDelegate(base)
        }
        appDelegate?.attachBaseContext(base)
    }

    fun onTerminate(application: Application) {
        appDelegate?.onTerminate(application)
    }
}