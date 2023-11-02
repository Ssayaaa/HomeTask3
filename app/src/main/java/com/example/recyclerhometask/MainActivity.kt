package com.example.recyclerhometask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerhometask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listOfAnimal = listOf(
            Animal("Elephant") ,
            Animal("Cat"),
            Animal("Dog"),
            Animal("lion") ,
            Animal("tiger"),
            Animal("Anuar"),
            Animal("Elephant") ,
            Animal("Cat"),
            Animal("Dog"),
            Animal("lion") ,
            Animal("tiger"),
            Animal("Anuar"),
            Animal("Elephant") ,
            Animal("Cat"),
            Animal("Dog"),
            Animal("lion") ,
            Animal("tiger"),
            Animal("Anuar"),

        )
        binding.rcViewid.adapter = AnimalAdapter(listOfAnimal)
        binding.rcViewid.layoutManager = LinearLayoutManager(this)
    }
}