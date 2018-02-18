package io.wwdaigo.starwars.api.domain

import com.google.gson.annotations.SerializedName
import io.wwdaigo.starwars.api.domain.base.BaseResult
import io.wwdaigo.starwars.api.domain.base.UrlReference
import java.util.*

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
        val species: List<UrlReference<Species>>,
        val starships: List<UrlReference<Starship>>,
        val vehicles: List<UrlReference<Vehicle>>,
        val characters: List<UrlReference<Person>>,
        val planets: List<UrlReference<Planet>>
): BaseResult()