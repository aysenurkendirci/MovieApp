package com.example.movieapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.movieapp.data.datasource.FilmlerDataSource
import com.example.movieapp.data.repo.FilmlerRepository
import com.example.movieapp.room.FilmlerDao
import com.example.movieapp.room.Veritabani
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

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
    fun provideFilmlerDao(@ApplicationContext context: Context): FilmlerDao {
        val vt = Room.databaseBuilder(
            context,
            Veritabani::class.java,
            "filmler_app.sqlite"
        )
            .createFromAsset("filmler_app.sqlite")
            .fallbackToDestructiveMigration()
            .build()

        return vt.getFilmlerDao()
    }
}

