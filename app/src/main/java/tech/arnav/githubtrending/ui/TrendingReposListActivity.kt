package tech.arnav.githubtrending.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import tech.arnav.githubtrending.R
import tech.arnav.githubtrending.TrendingGithubApp
import tech.arnav.lib.trendinggithub.services.TrendingGithubNow
import javax.inject.Inject

class TrendingReposListActivity : AppCompatActivity() {

    @Inject
    lateinit var trendingGithubNow: TrendingGithubNow

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as TrendingGithubApp).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trending_repos_list)

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
