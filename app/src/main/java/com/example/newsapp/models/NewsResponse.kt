package com.example.newsapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
): Parcelable