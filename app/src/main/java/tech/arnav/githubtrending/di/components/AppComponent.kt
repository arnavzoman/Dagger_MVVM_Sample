package tech.arnav.githubtrending.di.components

import android.app.Application
import dagger.Component
import tech.arnav.githubtrending.di.modules.AppModule
import tech.arnav.githubtrending.di.scopes.AppScope
import tech.arnav.lib.trendinggithub.di.components.ApiComponent

/**
 * created by championswimmer on 2019-12-20
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
@AppScope
@Component(dependencies = [ApiComponent::class], modules = [AppModule::class])
interface AppComponent {

    fun inject(application: Application)

    fun mainActivityComponent(): ActivityComponent.Builder

}