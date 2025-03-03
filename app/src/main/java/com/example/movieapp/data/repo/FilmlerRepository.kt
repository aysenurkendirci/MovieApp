package com.example.movieapp.data.repo

import androidx.lifecycle.MutableLiveData
import com.example.movieapp.data.datasource.FilmlerDataSource
import com.example.movieapp.data.entity.Filmler

class FilmlerRepository(var fds:FilmlerDataSource) {


   fun filmleriYukle() : MutableLiveData<List<Filmler>> = fds.filmleriYukle()
}