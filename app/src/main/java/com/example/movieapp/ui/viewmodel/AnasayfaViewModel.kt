package com.example.movieapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movieapp.data.entity.Filmler
import com.example.movieapp.data.repo.FilmlerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel : ViewModel() {
     var frepo = FilmlerRepository()
     var filmlerListesi = MutableLiveData<List<Filmler>>()
    init{
        filmleriYukle()
    }
    fun filmleriYukle(){
        CoroutineScope(Dispatchers.Main).launch{
            filmlerListesi.value=frepo.filmleriYukle()
        }
    }
}