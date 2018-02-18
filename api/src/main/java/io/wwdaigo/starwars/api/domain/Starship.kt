package io.wwdaigo.starwars.api.domain

import com.google.gson.annotations.SerializedName
import io.wwdaigo.starwars.api.domain.base.BaseResult
import io.wwdaigo.starwars.api.domain.base.UrlReference

data class Starship(
        val name: String,
        val model: String,
        @SerializedName("starship_class")
        val starshipClass: String,
        val manufacturer: String,
        @SerializedName("cost_in_credits")
        val costInCredits: String,
        val length: String,
        val crew: String,
        val passengers: String,
        @SerializedName("max_atmosphering_speed")
        val maxAtmospheringSpeed: String,
        @SerializedName("hyperdrive_rating")
        val hyperdriveRating: String,
        @SerializedName("MGLT")
        val mglt: String,
        @SerializedName("cargo_capacity")
        val cargoCapacity: String,
        val consumables: String,
        val films: List<UrlReference<Film>>,
        val pilots: List<UrlReference<Person>>
): BaseResult()