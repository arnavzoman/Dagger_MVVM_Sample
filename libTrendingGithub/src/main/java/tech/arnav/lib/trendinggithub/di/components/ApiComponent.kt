package tech.arnav.lib.trendinggithub.di.components

import dagger.Component
import tech.arnav.lib.trendinggithub.di.modules.ApiModule
import tech.arnav.lib.trendinggithub.di.modules.TrendingGithubModule
import tech.arnav.lib.trendinggithub.services.TrendingGithubNow
import javax.inject.Singleton

/**
 * created by championswimmer on 2019-12-20
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
@Component(
    modules = [
        TrendingGithubModule::class,
        ApiModule::class
    ]
)
@Singleton
interface ApiComponent {

    fun getTrendingGithubNowService(): TrendingGithubNow
}