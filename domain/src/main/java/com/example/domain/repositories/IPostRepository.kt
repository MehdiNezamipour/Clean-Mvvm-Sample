package com.example.domain.repositories

import com.example.domain.base.Result
import com.example.domain.models.Post

interface IPostRepository {

    suspend fun getUserPosts(userId: Int): Result<List<Post>>
}