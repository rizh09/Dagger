package com.example.dagger.api

import com.example.dagger.model.News
import retrofit2.http.GET

interface NewsApi {
    companion object{
        const val BASE_URL = ""
    }

    @GET("")
    suspend fun getNews() : List<News>
}