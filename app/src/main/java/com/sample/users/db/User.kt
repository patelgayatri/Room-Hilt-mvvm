package com.sample.users.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
class User(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")

    val id: Int = 0,
    @ColumnInfo(name = "user_name") val userName: String
)