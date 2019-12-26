package tech.arnav.lib.trendinggithub.di.modules

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import tech.arnav.lib.trendinggithub.services.TrendingGithubNow
import javax.inject.Named
import javax.inject.Singleton

/**
 * created by championswimmer on 2019-12-20
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
@Module
class TrendingGithubModule {

    @Provides
    @Named("ApiBaseUrl")
    fun provideApiBaseUrl() = "https://github-trending-api.now.sh"

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): TrendingGithubNow {
        return retrofit.create(TrendingGithubNow::class.java)
    }

}