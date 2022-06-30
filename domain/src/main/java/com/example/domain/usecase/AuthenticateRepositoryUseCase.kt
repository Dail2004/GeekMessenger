package com.example.domain.usecase

import com.example.domain.repository.AuthenticateRepository
import javax.inject.Inject

class AuthenticateRepositoryUseCase @Inject constructor(
    private val repository: AuthenticateRepository
) {
    operator fun invoke() = repository.fetchAccount()
}