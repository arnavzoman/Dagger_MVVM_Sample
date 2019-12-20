package tech.arnav.lib.trendinggithub.services

import retrofit2.http.GET
import tech.arnav.lib.trendinggithub.models.Developer
import tech.arnav.lib.trendinggithub.models.Language
import tech.arnav.lib.trendinggithub.models.Repository
import javax.xml.ws.Response

/**
 * created by championswimmer on 2019-12-20
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
interface TrendingGithubNow {

    @GET("languages")
    suspend fun getLanguages(): Response<List<Language>>

    @GET("repositories")
    suspend fun getRepositories(): Response<List<Repository>>

    @GET("developers")
    suspend fun getDevelopers(): Response<List<Developer>>
}