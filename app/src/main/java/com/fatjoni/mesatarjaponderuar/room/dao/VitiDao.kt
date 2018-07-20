package com.fatjoni.mesatarjaponderuar.room.dao

import androidx.room.*
import com.fatjoni.mesatarjaponderuar.room.entity.Viti

@Dao
interface VitiDao {

    @Query("SELECT * FROM viti")
    fun all(): List<Viti>

    @Insert
    fun insertAll(users: List<Viti>): List<Viti>

    @Insert
    fun insert(user: Viti): Long

    @Update
    fun update(user: Viti)

    @Delete
    fun delete(user: Viti)
}