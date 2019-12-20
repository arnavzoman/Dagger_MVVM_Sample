package tech.arnav.githubtrending

import android.app.Application
import tech.arnav.githubtrending.di.components.AppComponent
import tech.arnav.githubtrending.di.components.DaggerAppComponent
import tech.arnav.lib.trendinggithub.di.components.DaggerApiComponent
/**
 * created by championswimmer on 2019-12-20
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
class TrendingGithubApp: Application() {

    val appComponent: AppComponent = DaggerAppComponent.builder()
        .apiComponent(DaggerApiComponent.builder().build())
        .build()

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)

    }
}