package com.example.recyclerhometask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerhometask.databinding.ItemOneBinding

class AnimalAdapter(
    private val superList: List<Animal>
) : RecyclerView.Adapter<AnimalAdapter.AnimalHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalHolder {
      return  AnimalHolder(ItemOneBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = superList.size

    override fun onBindViewHolder(holder: AnimalHolder, position: Int) {
        holder.setData(superList[position])
    }

    class AnimalHolder(private val binding : ItemOneBinding ) : RecyclerView.ViewHolder(binding.root){


        fun setData(animal : Animal){
            binding.txtViewOne.text = animal.name
        }
    }
}