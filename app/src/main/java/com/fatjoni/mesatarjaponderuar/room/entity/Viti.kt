package com.fatjoni.mesatarjaponderuar.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Viti(
        @PrimaryKey(autoGenerate = true) val id: Int,
        @ColumnInfo(name = "emri") val emri: String
)