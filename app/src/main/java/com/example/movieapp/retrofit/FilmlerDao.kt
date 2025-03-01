package com.example.movieapp.retrofit

import com.example.movieapp.data.entity.FilmlerCevap
import retrofit2.http.GET

interface FilmlerDao {
    @GET("filmler_yeni/tum_filmler.php")
    suspend fun filmleriYukle(): FilmlerCevap
}