package com.example.domain.repository

import com.example.common.resource.Resource
import com.example.domain.model.UserModel
import kotlinx.coroutines.flow.Flow

interface AuthenticateRepository {
    fun fetchAccount(): Flow<Resource<List<UserModel>>>
}