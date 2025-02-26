package com.example.movieapp.data.datasource
import com.example.movieapp.room.FilmlerDao
import com.example.movieapp.data.entity.Filmler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource(var fdao:FilmlerDao) {
    suspend fun filmleriYukle() : List<Filmler> =
        withContext(Dispatchers.IO){
            return@withContext fdao.filmleriYukle()
        }
}