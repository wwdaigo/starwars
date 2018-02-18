package io.wwdaigo.starwars.api.domain

import com.google.gson.annotations.SerializedName
import io.wwdaigo.starwars.api.domain.base.BaseResult
import io.wwdaigo.starwars.api.domain.base.UrlReference

data class Species(
        val name: String,
        val classification: String,
        val designation: String,
        @SerializedName("average_height")
        val averageHeight: String,
        @SerializedName("average_lifespan")
        val averageLifespan: String,

        @SerializedName("eye_colors")
        val eyeColors: String,

        @SerializedName("hair_colors")
        val hairColors: String,

        @SerializedName("skin_colors")
        val skinColors: String,

        val language: String,
        val homeworld: UrlReference<Planet>,
        val people: List<UrlReference<Person>>,
        val films: List<UrlReference<Film>>

): BaseResult()