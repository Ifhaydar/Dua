package com.example.dua

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dua.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numberToDua = listOf(
            Dua(1, "Дуои субҳ", "a1"),
            Dua(2, "Дуои баъд аз хоб хестан", "a2"),
            Dua(3, "Дуо ҳангоми пушидани либос", "a3"),
            Dua(4, "Дуо ҳангоми ба ҳоҷатхона даромадан", "a4"),
            Dua(5, "Дуои аз ҳоҷатхона баромадан", "a5"),
            Dua(6, "Дуои субҳ", "a6")
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.recyclerView.adapter = DuaAdapter(numberToDua) {dua ->
            val intent = Intent(this, DuaActivity::class.java).apply {
                putExtra("dua", dua.duaValue)
            }
            startActivity(intent)
        }
    }
}