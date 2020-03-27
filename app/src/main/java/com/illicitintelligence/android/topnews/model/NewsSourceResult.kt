package com.illicitintelligence.android.topnews.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

data class NewsSourceResult(
    @SerializedName("status")
    @Expose
    val status: String? = null,
    @SerializedName("totalResults")
    @Expose
    val totalResults: Int? = null,
    @SerializedName("articles")
    @Expose
    val articles: ArrayList<Article>? = null)