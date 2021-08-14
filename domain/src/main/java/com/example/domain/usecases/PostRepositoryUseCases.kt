package com.example.domain.usecases

import com.example.domain.repositories.IPostRepository
import javax.inject.Inject

class PostRepositoryUseCases @Inject constructor(private val iPostRepository: IPostRepository) {

    suspend fun getPosts(userId: Int) = iPostRepository.getPosts(userId)


}