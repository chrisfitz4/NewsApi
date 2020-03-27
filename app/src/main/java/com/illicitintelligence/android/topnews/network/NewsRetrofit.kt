package com.illicitintelligence.android.topnews.network

import com.illicitintelligence.android.topnews.model.NewsSourceResult
import com.illicitintelligence.android.topnews.util.API_KEY
import com.illicitintelligence.android.topnews.util.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NewsRetrofit {
    private val retrofit: Retrofit by lazy{
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }
    private val newsService: NewsService by lazy {
        retrofit.create(NewsService::class.java)
    }

    suspend fun getTopNews(pageNum: Int) : NewsSourceResult {
        return newsService.getTopNews(API_KEY,pageNum,"en")
    }

    suspend fun searchNews(searchQuery: String, pageNum: Int) : NewsSourceResult {
        return newsService.searchNews(API_KEY,searchQuery,pageNum)
    }

}