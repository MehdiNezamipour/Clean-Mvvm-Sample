package com.example.data.source

import com.example.data.api.PostService
import com.example.data.models.response.PostListResponse
import com.example.domain.models.Post
import retrofit2.Response
import javax.inject.Inject

class PostDataSource @Inject constructor(private val postService: PostService) {

    suspend fun getUserPost(userId: Int): Response<List<Post>> {
        return postService.getUserPosts(userId)
    }






}