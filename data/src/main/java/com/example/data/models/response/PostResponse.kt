package com.example.data.models.response


data class PostListResponse(
    val totalCount: Int,
    val page: Int,
    val entities: MutableList<PostItem>?
)


data class PostItem(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)