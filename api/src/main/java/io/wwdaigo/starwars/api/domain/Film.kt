package io.wwdaigo.starwars.api.domain

import com.google.gson.annotations.SerializedName
import java.util.*

// TODO Species now as Any
data class Film(
        val title: String,
        @SerializedName("episode_id")
        val episodeId: Int,
        @SerializedName("opening_crawl")
        val openingCrawl: String,
        val director: String,
        val producer: String,
        @SerializedName("release_date")
        val releaseDate: Date,
        val species: List<UrlReference<Any>>,
        val starships: List<UrlReference<Any>>,
        val vehicles: List<UrlReference<Any>>,
        val characters: List<UrlReference<Any>>,
        val planets: List<UrlReference<Any>>
): BaseResult()