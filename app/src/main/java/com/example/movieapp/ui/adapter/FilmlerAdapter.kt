package com.example.movieapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.data.entity.Filmler
import com.example.movieapp.databinding.CardTasarimBinding
import com.example.movieapp.databinding.FragmentAnasayfaBinding
import com.example.movieapp.ui.fragment.AnasayfaFragment
import com.example.movieapp.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter(var mContext:Context,var FilmlerListesi:List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>()
{
    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
       val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }
    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = FilmlerListesi.get(position)
        val t=holder.tasarim
        t.imageViewFilm.setImageResource(
            mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))

        t.textViewFiyat.text="${film.fiyat}"

        t.cardViewFilm.setOnClickListener{
       val gecis= AnasayfaFragmentDirections.detayGecis(filn = film)
       Navigation.findNavController(it).navigate(gecis)

        }

        t.buttonSepet.setOnClickListener{
          Snackbar.make(it,"${film.ad} sepete eklendi",Snackbar.LENGTH_SHORT).show()

        }

    }
    override fun getItemCount(): Int {
      return FilmlerListesi.size
    }

}