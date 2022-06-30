package com.example.data.local.db

import android.content.Context
import androidx.room.Room
import com.example.data.local.db.daos.UserDao

class RoomClient {

    fun provideRoom(context: Context) = Room
        .databaseBuilder(context, AppDatabase::class.java, "boilerplate.db")
        .build()

    fun provideFooDao(appDatabase: AppDatabase): UserDao = appDatabase
        .fooDao()
}