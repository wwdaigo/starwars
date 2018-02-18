package io.wwdaigo.starwars.api.services

import io.reactivex.Observable
import io.wwdaigo.starwars.api.domain.*
import io.wwdaigo.starwars.api.domain.base.BaseResponse
import retrofit2.adapter.rxjava2.Result
import retrofit2.http.GET
import retrofit2.http.Path

typealias SingleResponse<K> = Observable<Result<BaseResponse<K>>>
typealias ListResponse<K> = Observable<Result<BaseResponse<List<K>>>>

interface StarWarsService {
    @GET("/")
    fun getRoot(): SingleResponse<Root>

    // People
    @GET("/people/")
    fun getPeople(): ListResponse<Person>

    @GET("/people/{id}")
    fun getPerson(@Path("id") id: Int): SingleResponse<Person>

    // Films
    @GET("/films/")
    fun getFilms(): ListResponse<Person>

    @GET("/films/{id}")
    fun getFilm(@Path("id") id: Int): SingleResponse<Person>

    // Starships
    @GET("/starships/")
    fun getStartships(): ListResponse<Starship>

    @GET("/starships/{id}")
    fun getStarship(@Path("id") id: Int): SingleResponse<Starship>

    // Vehicles
    @GET("/vehicles/")
    fun getVehicles(): ListResponse<Vehicle>

    @GET("/vehicles/{id}")
    fun getVehicle(@Path("id") id: Int): SingleResponse<Vehicle>

    // Planets
    @GET("/planets/")
    fun getPlanets(): ListResponse<Planet>

    @GET("/planets/{id}")
    fun getPlanet(@Path("id") id: Int): SingleResponse<Planet>
}