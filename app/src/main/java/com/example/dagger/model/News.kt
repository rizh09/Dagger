package com.example.dagger.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "news")
data class News (
    @PrimaryKey val title:String,
    val desc:String
)