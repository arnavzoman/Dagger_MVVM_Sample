package tech.arnav.githubtrending.di.components

import android.app.Application
import dagger.Component
import tech.arnav.lib.trendinggithub.di.components.ApiComponent

/**
 * created by championswimmer on 2019-12-20
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
@Component(dependencies = [ApiComponent::class])
interface AppComponent {

    fun inject(application: Application)

    fun getApiComponent(): ApiComponent

}