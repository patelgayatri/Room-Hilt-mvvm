package com.sample.users.db

import javax.inject.Inject

class UserRepository @Inject constructor(private val usersDao: UsersDao) {

    fun getUsers(): List<User> {
        return usersDao.getUsers()
    }

    fun insertUser(user: User) {
        usersDao.insertUser(user)
    }
}