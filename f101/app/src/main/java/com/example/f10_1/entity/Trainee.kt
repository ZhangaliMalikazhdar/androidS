package com.example.f10_1.entity

import androidx.room.*
import com.example.f10_1.entity.Gender
import com.example.f10_1.entity.Routine

@Entity(indices = [Index("name"), Index("age")],
    foreignKeys = [ForeignKey(entity = Gender::class,
        parentColumns = ["id"], childColumns = ["gender"])])
data class Trainee(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val age: Int,
    val gender: Int?,
    @Embedded
    val routine: Routine
)