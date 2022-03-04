package com.sample.users.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UsersDao {

    @Query("SELECT * FROM user")
    fun getUsers(): List<User>

    @Insert
    fun insertUser(user: User)

}
