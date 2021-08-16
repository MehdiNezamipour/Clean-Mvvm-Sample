package com.example.cleanmvvmsample.di

import com.example.data.api.UserService
import com.example.data.repositoris.UserRepository
import com.example.data.source.UserDataSource
import com.example.domain.usecases.UserRepositoryUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class UserModules {

    @Provides
    fun provideUserUsUseCases(
        userRepository: UserRepository
    ): UserRepositoryUseCases =
        UserRepositoryUseCases(userRepository)

    @Provides
    fun provideUserUsDataSource(
        userService: UserService
    ): UserDataSource =
        UserDataSource(userService)

}
