package com.wdb.component_lib.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppMoudle(private val application: Application) {

    @Singleton
    @Provides
    fun provideApplication(): Application {
        return this.application
    }
}