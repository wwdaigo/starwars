package io.wwdaigo.starwars.api.domain.base

import java.util.*

abstract class BaseResult {
    lateinit var created: Date
    lateinit var edited: Date
    lateinit var url: String
}