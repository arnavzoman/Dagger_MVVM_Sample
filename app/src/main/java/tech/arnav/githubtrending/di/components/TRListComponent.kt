package tech.arnav.githubtrending.di.components

import dagger.BindsInstance
import dagger.Subcomponent
import tech.arnav.githubtrending.TRListViewModel
import tech.arnav.githubtrending.di.modules.TRListModule
import tech.arnav.githubtrending.di.scopes.ActivityScope
import tech.arnav.githubtrending.ui.TrendingReposListActivity
import tech.arnav.lib.trendinggithub.services.TrendingGithubNow

/**
 * created by championswimmer on 2019-12-27
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
@ActivityScope
@Subcomponent(modules = [TRListModule::class])
interface TRListComponent {
    fun inject(activity: TrendingReposListActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): TRListComponent

        @BindsInstance
        fun bindActivity(activity: TrendingReposListActivity): Builder
    }
}