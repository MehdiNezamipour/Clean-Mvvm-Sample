package com.example.data.api

import com.example.data.models.response.PostListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PostService {

    @GET("/posts")
    suspend fun getUserPosts(@Query("userId") userId: Int): Response<PostListResponse>
}