package com.example.domain.repositories

import com.example.domain.models.Post
import retrofit2.Response

interface IPostRepository {

    suspend fun getUserPosts(userId: Int): Response<List<Post>>
}