package tech.arnav.lib.trendinggithub.di.components

import dagger.Component
import tech.arnav.lib.trendinggithub.di.modules.ApiModule
import tech.arnav.lib.trendinggithub.di.modules.TrendingGithubModule

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
interface ApiComponent {

}