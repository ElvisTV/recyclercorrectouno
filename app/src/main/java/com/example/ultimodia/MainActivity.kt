package com.example.ultimodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ultimodia.adapter.SuperHeroAdapter
import com.example.ultimodia.databinding.ActivityMainBinding
import kotlin.collections.listOf

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerview()
    }

    private fun initRecyclerview(){
        val manager = LinearLayoutManager(this);
//        val decoration = DividerItemDecoration(this, manager.orientation)

        binding.recyclerSuperHero.layoutManager = manager;
        binding.recyclerSuperHero.adapter =
            SuperHeroAdapter(SuperHeroProvider.superHeroList){superHero ->
                onItemSelected(
                    superHero
                )
            }
//        binding.recyclerSuperHero.addItemDecoration(decoration);
    }

    fun onItemSelected(superHero: SuperHero){
        Toast.makeText(this,superHero.superHero, Toast.LENGTH_SHORT).show()
    }
}