package com.illicitintelligence.android.topnews.network

import com.illicitintelligence.android.topnews.model.NewsSourceResult
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("/v2/top-headlines/")
    suspend fun getTopNews(
        @Query("apiKey") apiKey: String,
        @Query("page") pageNum: Int,
        @Query("language") language: String
    ): NewsSourceResult


    @GET("/v2/everything/")
    suspend fun searchNews(
        @Query("apiKey") apiKey: String,
        @Query("q") searchQuery: String,
        @Query("page") pageNum: Int
    ): NewsSourceResult
}