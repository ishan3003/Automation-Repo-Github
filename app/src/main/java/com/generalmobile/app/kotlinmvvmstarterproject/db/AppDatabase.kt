package com.generalmobile.app.kotlinmvvmstarterproject.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.generalmobile.app.kotlinmvvmstarterproject.db.dao.ExampleDao
import com.generalmobile.app.kotlinmvvmstarterproject.db.entities.Example

@Database(entities = arrayOf(Example::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}