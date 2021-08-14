package com.example.domain.usecases

import com.example.domain.repositories.IUserRepository
import javax.inject.Inject

class UserRepositoryUseCases @Inject constructor(private val iUserRepository: IUserRepository) {

    suspend fun getUsers() = iUserRepository.getUsers()

}