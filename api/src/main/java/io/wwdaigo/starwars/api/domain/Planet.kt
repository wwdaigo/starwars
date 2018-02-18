package io.wwdaigo.starwars.api.domain

import com.google.gson.annotations.SerializedName
import io.wwdaigo.starwars.api.domain.base.BaseResult
import io.wwdaigo.starwars.api.domain.base.UrlReference

data class Planet(
        val name: String,
        val diameter: String,
        @SerializedName("rotation_period")
        val rotationPeriod: String,
        @SerializedName("orbital_period")
        val orbitalPeriod: String,
        val gravity: String,
        val population: String,
        val climate: String,
        val terrain: String,
        @SerializedName("surface_water")
        val surfaceWater: String,
        val residents: List<UrlReference<Person>>,
        val films: List<UrlReference<Film>>
): BaseResult()