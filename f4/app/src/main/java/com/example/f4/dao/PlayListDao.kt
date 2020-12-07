package com.example.f4.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.f4.model.Playlist
import com.example.f4.model.PlaylistWithSongs

@Dao
interface PlaylistDao {
    @Insert
    fun insert(playlist: Playlist): Long


    @Transaction
    @Query("SELECT * FROM Playlist")
    fun getPlaylistsWithSongs(): List<PlaylistWithSongs>
}