package com.example.data.repositoris

import com.example.data.source.UserDataSource
import com.example.domain.models.User
import com.example.domain.repositories.IUserRepository
import retrofit2.Response
import javax.inject.Inject

class UserRepository @Inject constructor(private val userDataSource: UserDataSource) :
    IUserRepository {

    override suspend fun getUsers(): Response<List<User>> {
        return userDataSource.getUsers()
    }

}