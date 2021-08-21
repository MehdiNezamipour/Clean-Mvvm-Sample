package com.example.cleanmvvmsample.di

import com.example.data.api.UserService
import com.example.data.repositoris.UserRepository
import com.example.data.source.UserDataSource
import com.example.domain.usecases.UserRepositoryUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

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

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideUserService(retrofit: Retrofit): UserService {
        return retrofit.create(UserService::class.java)
    }
}
