package io.wwdaigo.starwars.api.domain

import io.wwdaigo.starwars.api.domain.base.UrlReference

data class Root(
        val films: List<UrlReference<Film>>,
        val people: List<UrlReference<Person>>,
        val planets: List<UrlReference<Planet>>,
        val species: List<UrlReference<Species>>,
        val starships: List<UrlReference<Starship>>,
        val vehicles: List<UrlReference<Vehicle>>
)