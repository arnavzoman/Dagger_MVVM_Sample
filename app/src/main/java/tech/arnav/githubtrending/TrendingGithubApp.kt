package tech.arnav.githubtrending

import android.app.Application
import tech.arnav.githubtrending.di.components.AppComponent
import tech.arnav.githubtrending.di.components.DaggerAppComponent

/**
 * created by championswimmer on 2019-12-20
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
class TrendingGithubApp: Application() {

    val appComponent: AppComponent = DaggerAppComponent.builder().build()

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)

    }
}