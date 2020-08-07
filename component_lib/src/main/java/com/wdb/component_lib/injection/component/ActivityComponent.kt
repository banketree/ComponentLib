package com.wdb.component_lib.injection.component

import android.app.Activity
import android.app.Application
import com.wdb.component_lib.injection.scope.ActivityScope
import com.wdb.component_lib.module.ActivityMoudle
import dagger.Component

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [ActivityMoudle::class]
)
interface ActivityComponent {

    fun application(): Application

    fun activity(): Activity
}