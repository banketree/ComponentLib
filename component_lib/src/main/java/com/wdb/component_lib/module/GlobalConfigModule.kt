package com.wdb.component_lib.module

import dagger.Module
import dagger.Provides
import java.util.concurrent.*
import javax.inject.Singleton

@Module
class GlobalConfigModule {

    private val executorService: ExecutorService? = null

    /**
     * 返回一个全局公用的线程池,适用于大多数异步需求。
     * 避免多个线程池创建带来的资源消耗。
     */
    @Singleton
    @Provides
    fun provideExecutorService(): ExecutorService {
        return executorService ?: ThreadPoolExecutor(
            0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS,
            SynchronousQueue<Runnable>(), threadFactory("Arms Executor", false)
        )
    }

    private fun threadFactory(name: String, daemon: Boolean): ThreadFactory {
        return ThreadFactory { runnable ->
            val result = Thread(runnable, name)
            result.isDaemon = daemon
            result
        }
    }
}