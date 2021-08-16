package com.example.cleanmvvmsample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleanmvvmsample.mappers.toPresenter
import com.example.cleanmvvmsample.models.UserModel
import com.example.domain.usecases.UserRepositoryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserFragmentViewModel @Inject constructor(private val userRepositoryUseCases: UserRepositoryUseCases) :
    ViewModel() {

    private val users: MutableLiveData<List<UserModel>> = MutableLiveData()

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