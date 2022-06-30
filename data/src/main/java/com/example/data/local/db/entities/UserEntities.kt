package com.example.data.local.db.entities

import androidx.room.Entity

@Entity
data class UserEntities(
    val login: String? = null,
    val password: String? = null,
)
