package com.example.data.source

import com.example.data.api.PostService
import com.example.data.models.response.PostListResponse
import retrofit2.Response
import javax.inject.Inject

class PostDataSource @Inject constructor(private val postService: PostService) {

    suspend fun getUserPost(userId: Int): Response<PostListResponse> {
        return postService.getUserPosts(userId)
    }



}