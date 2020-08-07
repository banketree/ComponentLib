package com.wdb.component_lib.module

import android.app.Activity
import com.wdb.component_lib.injection.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ActivityMoudle(private val activity: Activity) {

    @ActivityScope
    @Provides
    fun provideActivity(): Activity {
        return this.activity
    }
}