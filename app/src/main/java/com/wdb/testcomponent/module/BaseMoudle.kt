package com.wdb.testcomponent.module

import android.app.Activity
import com.wdb.component_lib.injection.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class BaseMoudle(private val activity: Activity) {

    @ActivityScope
    @Provides
    fun provideActivity(): Activity {
        return this.activity
    }
}