package io.wwdaigo.starwars.api.domain.base

data class UrlReference<T> (
        val url: String,
        val type: T
)