package com.example.data.source

import com.example.data.api.UserService
import com.example.data.models.response.UserListResponse
import retrofit2.Response
import javax.inject.Inject

class UserDataSource @Inject constructor(private val userService: UserService) {

    suspend fun getUsers(): Response<UserListResponse> {
        return userService.getUsers()
    }


}