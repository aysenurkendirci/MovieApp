package com.example.movieapp.data.repo

import com.example.movieapp.data.datasource.FilmlerDataSource
import com.example.movieapp.data.entity.Filmler
import javax.inject.Inject

class FilmlerRepository @Inject constructor(private val fdao: FilmlerDataSource) {
    suspend fun filmleriYukle(): List<Filmler> = fdao.filmleriYukle()
}

