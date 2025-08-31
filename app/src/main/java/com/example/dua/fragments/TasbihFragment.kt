package com.example.dua.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.room.InvalidationTracker
import com.example.dua.MainActivity
import com.example.dua.R
import com.example.dua.TasbihViewModel
import com.example.dua.databinding.FragmentTasbihBinding
import kotlin.getValue

class TasbihFragment : Fragment() {
    private val viewModel: TasbihViewModel by viewModels()
    private var _binding: FragmentTasbihBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTasbihBinding.inflate(inflater,container,false)

        viewModel.counter.observe(viewLifecycleOwner, Observer { count ->
            binding.tvCounter.text = count.toString()
        })

        binding.btnSubhonalloh.setOnClickListener {
            viewModel.counterTasbih()
        }

        binding.btnAlhamdulilloh.setOnClickListener {
            viewModel.counterTasbih()
        }

        binding.btnAllohuAkbar.setOnClickListener {
            viewModel.counterTasbih()
        }

        binding.btnClear.setOnClickListener {
            viewModel.clearCounter()
        }

        return binding.root
    }
}