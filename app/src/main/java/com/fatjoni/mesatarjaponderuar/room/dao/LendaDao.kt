package com.fatjoni.mesatarjaponderuar.room.dao

import androidx.room.*
import com.fatjoni.mesatarjaponderuar.room.entity.Lenda

@Dao
interface LendaDao {

    @Query("SELECT * FROM lenda")
    fun all(): List<Lenda>

    @Insert
    fun insertAll(users: List<Lenda>): List<Lenda>

    @Insert
    fun insert(user: Lenda): Long

    @Update
    fun update(user: Lenda)

    @Delete
    fun delete(user: Lenda)
}