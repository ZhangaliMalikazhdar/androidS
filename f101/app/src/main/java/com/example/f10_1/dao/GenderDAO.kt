package com.example.f10_1.dao

import androidx.room.*
import com.example.f10_1.entity.Gender

@Dao
interface GenderDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertGender(gender: Gender)

    @Update
    fun updateGender(gender: Gender)

    @Delete
    fun deleteGender(gender: Gender)

    @Query("SELECT * FROM Gender WHERE name == :name")
    fun getGenderByName(name: String): List<Gender>

    @Query("SELECT * FROM Gender")
    fun getGenders(): List<Gender>
}