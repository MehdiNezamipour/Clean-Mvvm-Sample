package com.example.cleanmvvmsample.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleanmvvmsample.mappers.toPresenter
import com.example.cleanmvvmsample.models.UserModel
import com.example.domain.usecases.UserRepositoryUseCases
import kotlinx.coroutines.launch

class UserFragmentViewModel @ViewModelInject constructor(private val userRepositoryUseCases: UserRepositoryUseCases) :
    ViewModel() {

    val users: MutableLiveData<List<UserModel>> = MutableLiveData()

    fun getUsers() {
        viewModelScope.launch {
            val response = userRepositoryUseCases.getUsers()
            if (response.isSuccessful) {
                val userList = response.body()?.map {
                    it.toPresenter()
                }
                users.value = userList
            }
        }

    }

}