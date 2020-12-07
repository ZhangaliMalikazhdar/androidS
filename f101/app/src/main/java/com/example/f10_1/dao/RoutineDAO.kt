package com.example.f10_1.dao

import androidx.room.*
import com.example.f10_1.entity.Routine
import java.util.*

@Dao
interface RoutineDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRoutine(routine: Routine)

    @Update
    fun updateRoutine(routine: Routine)

    @Delete
    fun deleteRoutine(routine: Routine)

    @Query("SELECT * FROM traineeRoutine WHERE due_Day >= :due")
    fun getRoutineByDueDate(due: Date): List<Routine>
}