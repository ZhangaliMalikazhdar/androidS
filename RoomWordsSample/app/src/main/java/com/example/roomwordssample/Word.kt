package com.example.roomwordssample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//version1
//data class Word(val word: String)

//version2
//@Entity(tableName = "word_table")
//class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)

//version3
@Entity(tableName = "word_table")
class Word(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "word") val word: String
)