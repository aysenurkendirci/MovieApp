package com.example.movieapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.movieapp.R
import com.example.movieapp.data.entity.Filmler
import com.example.movieapp.databinding.FragmentAnasayfaBinding
import com.example.movieapp.ui.adapter.FilmlerAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title="Filmler"
        binding.filmRv.layoutManager= StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


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

        val filmlerAdapter = FilmlerAdapter(requireContext(),filmlerlistesi)
        binding.filmRv.adapter= filmlerAdapter

        return binding.root
    }
}

