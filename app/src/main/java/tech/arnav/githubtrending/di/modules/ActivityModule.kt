package tech.arnav.githubtrending.di.modules

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import dagger.Module
import dagger.Provides
import tech.arnav.githubtrending.di.scopes.ActivityScope
import tech.arnav.githubtrending.viewmodels.TrendingListsViewModel

/**
 * created by championswimmer on 2019-12-26
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
@Module
class ActivityModule {

    @Provides
    @ActivityScope
    fun provideViewModelProvider(vmso: ViewModelStoreOwner): ViewModelProvider {
        return ViewModelProvider(vmso)
    }

    @Provides
    @ActivityScope
    fun provideTrendingListsViewModel(viewModelProvider: ViewModelProvider): TrendingListsViewModel {
        return viewModelProvider.get(TrendingListsViewModel::class.java)
    }
}