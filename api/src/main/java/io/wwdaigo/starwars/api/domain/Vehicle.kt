package io.wwdaigo.starwars.api.domain

import com.google.gson.annotations.SerializedName
import io.wwdaigo.starwars.api.domain.base.BaseResult
import io.wwdaigo.starwars.api.domain.base.UrlReference

data class Vehicle(
        val name: String,
        val model: String,
        @SerializedName("vehicle_class")
        val vehicleClass: String,
        val manufacturer: String,
        val length: String,
        @SerializedName("cost_in_credits")
        val costInCredits: String,
        val crew: String,
        val passengers: String,
        @SerializedName("max_atmosphering_speed")
        val maxAtmospheringSpeed: String,
        @SerializedName("cargo_capacity")
        val cargoCapacity: String,
        val consumables: String,
        val films: List<UrlReference<Film>>,
        val pilots: List<UrlReference<Person>>
): BaseResult()