package com.example.dua

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DuaAdapter(private val listDua: List<Dua>, private val onItemClick: (Dua) -> Unit): RecyclerView.Adapter<DuaAdapter.DuaViewHolder>() {
    inner class DuaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(dua: Dua) {
            val tvNumberDua = itemView.findViewById<TextView>(R.id.tv_number)
            val tvDuaName = itemView.findViewById<TextView>(R.id.tv_dua)

            tvNumberDua.text = dua.numberDua.toString()
            tvDuaName.text = dua.duaName

            itemView.setOnClickListener { onItemClick(dua) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DuaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dua, parent, false)
        return DuaViewHolder(view)
    }

    override fun getItemCount(): Int  = listDua.size

    override fun onBindViewHolder(holder: DuaViewHolder, position: Int) {
        holder.bind(listDua[position])
    }
}