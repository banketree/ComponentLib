package com.wdb.testcomponent.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseConfigModule {

    private val cacheFactory: Any? = null

    /*
    * 缓存
    * */
    @Singleton
    @Provides
    fun provideCacheFactory(application: Application): Any {
        return Any()
    }
}