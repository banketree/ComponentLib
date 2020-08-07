package com.wdb.testcomponent.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppMoudle(private val application: Application) {

    @Singleton
    @Provides
    fun provideExtras(): Any{
        return Any()
    }
}