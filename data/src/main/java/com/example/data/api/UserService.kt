package com.example.data.api

import com.example.data.models.response.UserListResponse
import retrofit2.Response
import retrofit2.http.GET

interface UserService {

    @GET("/users")
    suspend fun getUsers(): Response<UserListResponse>


}