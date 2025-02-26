package com.example.movieapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.movieapp.data.entity.Filmler

@Database(entities = [Filmler::class], version = 2, exportSchema = true)
abstract class Veritabani : RoomDatabase() {
    abstract fun getFilmlerDao(): FilmlerDao
}


