package com.example.data.local.db.daos

import androidx.room.Dao

@Dao
interface UserDao {
    val login: String?
    val password: String?
}