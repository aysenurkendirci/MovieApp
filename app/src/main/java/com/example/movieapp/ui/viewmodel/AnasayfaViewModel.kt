package com.example.movieapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movieapp.data.entity.Filmler
import com.example.movieapp.data.repo.FilmlerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var frepo:FilmlerRepository) : ViewModel() {
     var filmlerListesi = MutableLiveData<List<Filmler>>()
    init{
        filmleriYukle()
    }
    fun filmleriYukle(){
        filmlerListesi=frepo.filmleriYukle()
    }
}