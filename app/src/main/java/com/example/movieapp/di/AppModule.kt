package com.example.movieapp.di

import com.example.movieapp.data.datasource.FilmlerDataSource
import com.example.movieapp.data.repo.FilmlerRepository
import com.example.movieapp.retrofit.FilmlerDao
import com.example.movieapp.retrofit.ApiUtils
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFilmlerDataSource(fdao: FilmlerDao): FilmlerDataSource {
        return FilmlerDataSource(fdao)
    }

    @Provides
    @Singleton
    fun provideFilmlerRepository(fds: FilmlerDataSource): FilmlerRepository {
        return FilmlerRepository(fds)
    }

    @Provides
    @Singleton
    fun provideFilmlerDao(): FilmlerDao {
        return ApiUtils.getFilmlerDao()
    }
}
