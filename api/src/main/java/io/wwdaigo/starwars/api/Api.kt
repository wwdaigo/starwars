package io.wwdaigo.starwars.api

import io.wwdaigo.starwars.api.commons.API_URL
import io.wwdaigo.starwars.api.services.StarWarsService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object Api {

    private val okHttpClient = OkHttpClient.Builder()
            .build()

    private val retrofitService = Retrofit.Builder()
            .baseUrl(API_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

    fun request(): StarWarsService {
        return retrofitService.create(StarWarsService::class.java)
    }
}