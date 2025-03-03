package com.example.movieapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.movieapp.R
import com.example.movieapp.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detay, container, false)

        val bundle:DetayFragmentArgs by navArgs()
        val film = bundle.filn

        binding.filmNesnesi=film
        val url = "http://kasimadalan.pe.hu/filmler_yeni/resimler/${film.resim}"
        Glide.with(this).load(url).override(500,750).into(binding.ivFilm)

        return binding.root
    }
}

