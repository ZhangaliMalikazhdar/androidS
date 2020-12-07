package com.example.f10_1.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Exercise(
    @PrimaryKey(autoGenerate = true)
    val exerciseId: Int,
    val name: String,
    val repetitions:Int,
    @ColumnInfo(name = "machine_name")
    val machineName: String,
    val liftedWeight: Int)