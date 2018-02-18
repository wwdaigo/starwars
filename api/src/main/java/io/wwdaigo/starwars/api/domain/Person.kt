package io.wwdaigo.starwars.api.domain

import com.google.gson.annotations.SerializedName
import io.wwdaigo.starwars.api.domain.base.BaseResult
import io.wwdaigo.starwars.api.domain.base.UrlReference

data class Person(
        val name: String,
        @SerializedName("birth_year")
        val birthYear: String,
        @SerializedName("eye_color")
        val eyeColor: String,
        val gender: String,
        @SerializedName("hair_color")
        val hairColor: String,
        val height: String,
        val mass: String,
        @SerializedName("skin_color")
        val skinColor: String,
        val homeworld: UrlReference<Planet>,
        val films: List<UrlReference<Film>>,
        val species: List<UrlReference<Species>>,
        val starships: List<UrlReference<Starship>>,
        val vehicles: List<UrlReference<Vehicle>>

): BaseResult()