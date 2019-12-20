package tech.arnav.lib.trendinggithub.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Repository(
    @Json(name = "author") val author: String,
    @Json(name = "avatar") val avatar: String,
    @Json(name = "builtBy") val builtBy: List<Dev>,
    @Json(name = "currentPeriodStars") val currentPeriodStars: Int,
    @Json(name = "description") val description: String,
    @Json(name = "forks") val forks: Int,
    @Json(name = "language") val language: String?,
    @Json(name = "languageColor") val languageColor: String?,
    @Json(name = "name") val name: String,
    @Json(name = "stars") val stars: Int,
    @Json(name = "url") val url: String
) {
    @JsonClass(generateAdapter = true)
    data class Dev(
        @Json(name = "avatar") val avatar: String,
        @Json(name = "href") val href: String,
        @Json(name = "username") val username: String
    )
}