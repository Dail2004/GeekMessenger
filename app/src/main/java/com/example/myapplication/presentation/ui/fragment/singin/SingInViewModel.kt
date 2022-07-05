package com.example.myapplication.presentation.ui.fragment.singin

import androidx.lifecycle.ViewModel
import com.example.domain.usecase.AuthenticateRepositoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SingInViewModel @Inject constructor(
    private val repository: AuthenticateRepositoryUseCase
) : ViewModel() {

}