package com.example.data.repositoris

import com.example.data.models.response.UserListResponse
import com.example.data.source.PostDataSource
import com.example.domain.models.Post
import com.example.domain.repositories.IPostRepository
import retrofit2.Response
import javax.inject.Inject

class PostRepository @Inject constructor(private val postDataSource: PostDataSource) :
    IPostRepository {

    override suspend fun getUserPosts(userId: Int): Response<List<Post>> {
        return postDataSource.getUserPost(userId)
    }
}