package com.example.f4.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.f4.model.Song

@Dao
interface SongDao {
    @Insert
    fun insert(song: Song): Long
}