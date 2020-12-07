package com.example.f10_1.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Gender(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String)