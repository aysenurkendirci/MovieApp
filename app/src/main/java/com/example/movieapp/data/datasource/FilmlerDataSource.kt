package com.example.movieapp.data.datasource

import com.example.movieapp.data.entity.Filmler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmlerDataSource {
    suspend fun filmleriYukle() : List<Filmler> =
        withContext(Dispatchers.IO){
            val filmlerlistesi = ArrayList<Filmler>()
            val f1=Filmler(1,"Django","django",24)
            val f2=Filmler(2,"Interstellar","interstellar",32)
            val f3=Filmler(3,"Inception","inception",16)
            val f4=Filmler(4,"The Hateful Eight","thehatefuleight",28)
            val f5=Filmler(5,"The Pianist","thepianist",18)
            val f6=Filmler(6,"Anadoluda","anadoluda",10)
            filmlerlistesi.add(f1)
            filmlerlistesi.add(f2)
            filmlerlistesi.add(f3)
            filmlerlistesi.add(f4)
            filmlerlistesi.add(f5)
            filmlerlistesi.add(f6)

            return@withContext filmlerlistesi
        }
}