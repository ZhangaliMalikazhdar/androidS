package com.example.f4.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.f4.model.Library

@Dao
interface LibraryDao {
    @Insert
    fun insert(library: Library): Long
}