package io.wwdaigo.starwars.api.domain

data class UrlReference<T> (
        val url: String,
        val type: T
)