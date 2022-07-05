package com.example.data.repositories

import com.google.firebase.database.FirebaseDatabase
import javax.inject.Inject

class ChatRepositoriesImpl @Inject constructor(
    private val chat: FirebaseDatabase
) {

}