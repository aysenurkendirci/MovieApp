package com.example.movieapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.movieapp.R
import com.example.movieapp.data.entity.Filmler
import com.example.movieapp.databinding.FragmentAnasayfaBinding
import com.example.movieapp.ui.adapter.FilmlerAdapter
import com.example.movieapp.ui.viewmodel.AnasayfaViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {

    private var _binding: FragmentAnasayfaBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: AnasayfaViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentAnasayfaBinding.inflate(inflater, container, false) 

        binding.anasayfaToolbarBaslik = "Filmler"

        viewModel.filmlerListesi.observe(viewLifecycleOwner) {
            val filmlerAdapter = FilmlerAdapter(requireContext(), it)
            binding.filmlerAdapter = filmlerAdapter
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: AnasayfaViewModel by viewModels()
        viewModel = tempViewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


