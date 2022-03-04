package com.sample.users.di

import android.app.Application
import android.content.Context
import com.sample.users.db.AppDatabase
import com.sample.users.db.UsersDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getAppDB(context: Application): AppDatabase {
        return AppDatabase.getDB(context)
    }

    @Singleton
    @Provides
    fun getUsersDao(appDatabase: AppDatabase): UsersDao{
        return appDatabase.usersDao()
    }
}