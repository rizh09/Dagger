package com.example.dagger.model.DB

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dagger.model.News
import com.example.dagger.model.NewsDao

@Database(entities = [News::class], version = 1)
abstract class NewsDatabase : RoomDatabase() {

    abstract fun newsDao(): NewsDao
}