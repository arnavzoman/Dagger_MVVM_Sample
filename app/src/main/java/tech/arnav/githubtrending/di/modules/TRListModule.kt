package tech.arnav.githubtrending.di.modules

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import dagger.Binds
import dagger.Module
import dagger.Provides
import tech.arnav.githubtrending.TRListViewModel
import tech.arnav.githubtrending.di.scopes.ActivityScope
import tech.arnav.githubtrending.ui.TrendingReposListActivity

/**
 * created by championswimmer on 2019-12-27
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
@Module
class TRListModule {

    @ActivityScope
    @Provides
    fun provideViewModelProviderInstance(trlistActivity: TrendingReposListActivity): ViewModelProvider {
        return ViewModelProvider(trlistActivity)
    }

    @ActivityScope
    @Provides
    fun provideViewModel(viewModelProvider: ViewModelProvider): TRListViewModel {
        return viewModelProvider.get(TRListViewModel::class.java)
    }
}