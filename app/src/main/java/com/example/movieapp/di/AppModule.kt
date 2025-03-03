package com.example.movieapp.di

import com.example.movieapp.data.datasource.FilmlerDataSource
import com.example.movieapp.data.repo.FilmlerRepository
import com.google.firebase.Firebase
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.firestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideFilmlerDataSource(collectionFilmler: CollectionReference):FilmlerDataSource{
        return FilmlerDataSource(collectionFilmler)
    }
    @Provides
    @Singleton
    fun provideFilmlerFilmlerRepository(fds:FilmlerDataSource):FilmlerRepository{
        return FilmlerRepository(fds)
    }
    @Provides
    @Singleton
    fun provideCollectionReference():CollectionReference{
        return Firebase.firestore.collection("Filmler")
    }
}