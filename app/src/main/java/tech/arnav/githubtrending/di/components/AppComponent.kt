package tech.arnav.githubtrending.di.components

import android.app.Application
import dagger.Component
import tech.arnav.githubtrending.di.scopes.AppScope
import tech.arnav.githubtrending.ui.TrendingReposListActivity
import tech.arnav.lib.trendinggithub.di.components.ApiComponent
import tech.arnav.lib.trendinggithub.services.TrendingGithubNow
import javax.inject.Singleton

/**
 * created by championswimmer on 2019-12-20
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
@AppScope
@Component(dependencies = [ApiComponent::class])
interface AppComponent {

    fun trListComponent(): TRListComponent.Builder

    fun inject(application: Application)

}