package com.fatjoni.mesatarjaponderuar.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.fatjoni.mesatarjaponderuar.room.dao.LendaDao
import com.fatjoni.mesatarjaponderuar.room.dao.VitiDao
import com.fatjoni.mesatarjaponderuar.room.entity.Lenda
import com.fatjoni.mesatarjaponderuar.room.entity.Viti


@Database(entities = arrayOf(Lenda::class, Viti::class), version = 1)
abstract class AppDatabase : RoomDatabase() {


}