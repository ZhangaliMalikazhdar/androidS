package com.example.f10_1.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.f10_1.*
import com.example.f10_1.converter.DateTypeConverter
import com.example.f10_1.dao.ExerciseDao
import com.example.f10_1.dao.RoutineDao
import com.example.f10_1.dao.TraineeDao
import com.example.f10_1.entity.Exercise
import com.example.f10_1.entity.Gender
import com.example.f10_1.entity.Routine
import com.example.f10_1.entity.Trainee

@Database(entities = [Exercise::class, Gender::class, Routine::class, Trainee::class], version = 1)
@TypeConverters(DateTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
    abstract fun genderDao(): GenderDao
    abstract fun routineDao(): RoutineDao
    abstract fun traineeDao(): TraineeDao

    companion object {
        var INSTANCE: AppDatabase? = null

        fun getAppDataBase(context: Context): AppDatabase? {
            if (INSTANCE == null){
                synchronized(AppDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "myDB").build()
                }
            }
            return INSTANCE
        }

        fun destroyDataBase(){
            INSTANCE = null
        }
    }
}