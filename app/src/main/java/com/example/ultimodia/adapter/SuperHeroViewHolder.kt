package com.example.ultimodia.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.ultimodia.R
import com.example.ultimodia.SuperHero
import com.bumptech.glide.Glide
import com.example.ultimodia.databinding.ItemSuperheroBinding

class SuperHeroViewHolder (view : View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)


    fun render (superHeroModel: SuperHero, onClickListener:((SuperHero) -> Unit)){
        binding.tvSuperHeroName.text = superHeroModel.superHero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero);

        itemView.setOnClickListener{onClickListener(superHeroModel)}



//        binding.ivSuperHero.setOnClickListener{
//            Toast.makeText(
//                binding.ivSuperHero.context,
//                superHeroModel.realName,
//                Toast.LENGTH_SHORT
//            ).show()
//        }
//
//        itemView.setOnClickListener{
//            Toast.makeText(
//                binding.ivSuperHero.context,
//                superHeroModel.superHero,
//                Toast.LENGTH_SHORT
//            ).show()
//        }

    }

}