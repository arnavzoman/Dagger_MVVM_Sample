package tech.arnav.githubtrending.di.components

import androidx.lifecycle.ViewModelStoreOwner
import dagger.Subcomponent
import tech.arnav.githubtrending.di.modules.ActivityModule
import tech.arnav.githubtrending.di.scopes.ActivityScope

/**
 * created by championswimmer on 2019-12-26
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(vmStoreOwner: ViewModelStoreOwner)

    @Subcomponent.Builder
    interface Builder {
        fun build(): ActivityComponent
    }
}