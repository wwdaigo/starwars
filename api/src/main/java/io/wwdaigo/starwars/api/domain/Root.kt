package io.wwdaigo.starwars.api.domain

import io.wwdaigo.starwars.api.domain.base.UrlReference

// TODO any as placeholder
data class Root(
        val films: List<UrlReference<Film>>,
        val people: Any,
        val planets: Any,
        val species: Any,
        val starships: Any,
        val vehicles: Any
)