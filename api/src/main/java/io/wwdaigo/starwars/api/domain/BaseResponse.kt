package io.wwdaigo.starwars.api.domain

data class BaseResponse <out T> (
        val count: Int,
        val next: String?,
        val previous: String?,
        val result:T?
)