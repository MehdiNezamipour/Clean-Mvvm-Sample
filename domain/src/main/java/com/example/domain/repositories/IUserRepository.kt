package com.example.domain.repositories

import com.example.domain.models.User
import retrofit2.Response

interface IUserRepository {

    suspend fun getUsers(): Response<List<User>>

}