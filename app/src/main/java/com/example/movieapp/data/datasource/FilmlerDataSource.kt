package com.example.movieapp.data.datasource

import com.example.movieapp.data.entity.Filmler
import com.example.movieapp.retrofit.FilmlerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource(var fdao:FilmlerDao) {
    suspend fun filmleriYukle() : List<Filmler> =
        withContext(Dispatchers.IO){
            return@withContext fdao.filmleriYukle().filmler
        }
}