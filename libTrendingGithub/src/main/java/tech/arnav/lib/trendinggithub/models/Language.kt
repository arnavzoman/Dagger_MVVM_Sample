package tech.arnav.lib.trendinggithub.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Language(
    @Json(name = "id") val id: String,
    @Json(name = "name") val name: String
)