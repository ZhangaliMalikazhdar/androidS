package com.example.f4.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.f4.model.PlaylistSongCrossRef

@Dao
interface PlaylistSongCrossRefDao {
    @Insert
    fun insert(playlistSongCrossRef: PlaylistSongCrossRef)
}