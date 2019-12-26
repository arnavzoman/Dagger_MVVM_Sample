package tech.arnav.githubtrending.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import tech.arnav.githubtrending.R
import tech.arnav.githubtrending.TrendingGithubApp
import tech.arnav.githubtrending.di.components.ActivityComponent
import tech.arnav.githubtrending.viewmodels.TrendingListsViewModel
import tech.arnav.lib.trendinggithub.services.TrendingGithubNow
import javax.inject.Inject

class TrendingReposListActivity : AppCompatActivity() {

    private lateinit var activityComponent: ActivityComponent

    @Inject lateinit var trendingGithubNow: TrendingGithubNow
    @Inject lateinit var viewModelProvider: ViewModelProvider
    @Inject lateinit var trendingListsViewModel: TrendingListsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent = (application as TrendingGithubApp)
            .appComponent.mainActivityComponent()
            .build()
        activityComponent.inject(this@TrendingReposListActivity)
        setContentView(R.layout.activity_trending_repos_list)

//        Toast.makeText(this, trendingListsViewModel.x, Toast.LENGTH_SHORT).show()

        GlobalScope.launch(Dispatchers.IO) {
            val repos = trendingGithubNow.getRepositories()

            withContext(Dispatchers.Main) {
                Toast.makeText(
                    this@TrendingReposListActivity,
                    "repos = ${repos.size}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    }
}
