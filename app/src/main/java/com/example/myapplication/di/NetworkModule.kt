package com.example.myapplication.di

import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

//    @Singleton
//    @Provides
//    fun provideAuthenticateRepositories() = FirebaseFirestore.getInstance()

    @Singleton
    @Provides
    fun provideFireStorage() = FirebaseFirestore.getInstance()

}