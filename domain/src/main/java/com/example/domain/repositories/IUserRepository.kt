package com.example.domain.repositories

import com.example.domain.base.Result
import com.example.domain.models.User

interface IUserRepository {

    suspend fun getUsers(): Result<List<User>>

}