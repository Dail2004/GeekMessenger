package com.example.data.repositories

import com.example.common.constants.Constants
import com.example.data.repositories.base.BaseRepository
import com.example.domain.model.UserModel
import com.example.domain.repository.AuthenticateRepository
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthenticateRepositoriesImpl @Inject constructor(
    private val firebaseDatabase: FirebaseFirestore
) : BaseRepository(), AuthenticateRepository {
    private val userCollection = firebaseDatabase.collection(Constants.COLLECTION_USERS)

    override fun fetchAccount() = doRequest {
        userCollection.get().await().documents.mapNotNull { document ->
            document.toObject(UserModel::class.java)
        }
    }
}