package com.wdb.component_lib.config

import android.app.Application
import android.content.Context
import androidx.fragment.app.FragmentManager
import com.wdb.component_lib.core.AppLifeCycles
import com.wdb.component_lib.core.ConfigModule

class GlobalConfiguration : ConfigModule {

    override fun injectAppLifecycle(context: Context, lifeCycles: MutableList<AppLifeCycles>) {
        lifeCycles.add(ApplicationLifeCyclesImpl())
    }

    override fun injectActivityLifecycle(
        context: Context,
        lifeCycles: MutableList<Application.ActivityLifecycleCallbacks>
    ) {
        lifeCycles.add(ActivityLifecycleCallbacksImpl())
    }

    override fun injectFragmentLifecycle(
        context: Context,
        lifeCycles: MutableList<FragmentManager.FragmentLifecycleCallbacks>
    ) {
        lifeCycles.add(FragmentLifecycleCallbacksImpl())
    }

}