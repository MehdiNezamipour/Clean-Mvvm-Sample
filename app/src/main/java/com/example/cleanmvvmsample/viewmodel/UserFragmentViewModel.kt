package com.example.cleanmvvmsample.viewmodel

import androidx.lifecycle.ViewModel
import com.example.domain.usecases.UserRepositoryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserFragmentViewModel @Inject constructor(private val useCases: UserRepositoryUseCases) :
    ViewModel() {


}