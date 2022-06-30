package com.example.myapplication.di

import com.example.data.repositories.AuthenticateRepositoriesImpl
import com.example.domain.repository.AuthenticateRepository
import com.example.domain.usecase.AuthenticateRepositoryUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindAuthenticate(authenticateRepositories: AuthenticateRepositoriesImpl): AuthenticateRepository

//    @Binds
//    abstract fun bindChatRepository(chatRepositories: ChatRepositories):
}