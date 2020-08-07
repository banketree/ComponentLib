package com.wdb.component_lib.injection.component

import android.app.Application
import com.wdb.component_lib.module.AppMoudle
import com.wdb.component_lib.module.GlobalConfigModule
import dagger.Component
import java.util.concurrent.ExecutorService
import javax.inject.Singleton

@Singleton
@Component(modules = [AppMoudle::class, GlobalConfigModule::class])
interface AppComponent {

    fun application(): Application

    /**
     * 返回一个全局公用的线程池,适用于大多数异步需求。
     * 避免多个线程池创建带来的资源消耗。
     */
    fun executorService(): ExecutorService
}