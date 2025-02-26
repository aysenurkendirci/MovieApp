package com.example.movieapp.room

import androidx.room.Dao
import androidx.room.Query
import com.example.movieapp.data.entity.Filmler

@Dao
interface FilmlerDao {
    @Query("SELECT * FROM filmler")
   suspend fun filmleriYukle(): List<Filmler>
}
