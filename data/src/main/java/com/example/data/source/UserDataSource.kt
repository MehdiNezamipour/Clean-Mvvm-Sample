package com.example.data.source

import com.example.data.api.UserService
import com.example.data.models.response.UserListResponse
import com.example.domain.models.Post
import com.example.domain.models.User
import retrofit2.Response
import javax.inject.Inject

class UserDataSource @Inject constructor(private val userService: UserService) {

    suspend fun getUsers(): Response<List<User>> {
        return userService.getUsers()
    }


}