package com.fatjoni.mesatarjaponderuar.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Lenda(
        @PrimaryKey(autoGenerate = true) val id: Int,
        @ColumnInfo(name = "emri") val emri: String,
        @ColumnInfo(name = "vleresimi") val vleresimi: Int = 0,
        @ColumnInfo(name = "kredite") val kredite: Double = 0.0
        )