package com.example.movieapp.data.repo

import com.example.movieapp.data.datasource.FilmlerDataSource
import com.example.movieapp.data.entity.Filmler

class FilmlerRepository(var fds:FilmlerDataSource) {

    suspend fun filmleriYukle() : List<Filmler> = fds.filmleriYukle()
}