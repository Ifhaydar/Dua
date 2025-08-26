package com.example.dua

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.dua.databinding.ItemDuaBinding

class DuaAdapter(
    private val listDua: List<Dua>,
    val onItemClick: (Dua) -> Unit
): RecyclerView.Adapter<DuaAdapter.DuaViewHolder>() {
    class DuaViewHolder(private val binding: ItemDuaBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(dua: Dua, onItemClick: (Dua) -> Unit) {
            binding.tvNumber.text = dua.id.toString()
            binding.tvDua.text = dua.duaName

            binding.root.setOnClickListener {
                onItemClick(dua)
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DuaViewHolder {
        val view = ItemDuaBinding.inflate(parent.context.getSystemService(LayoutInflater::class.java), parent, false)
        return DuaViewHolder(view)
    }

    override fun getItemCount(): Int  = listDua.size

    override fun onBindViewHolder(holder: DuaViewHolder, position: Int) {
        holder.bind(listDua[position], onItemClick)
    }
}