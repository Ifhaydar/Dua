package com.example.dua.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.navArgs
import com.example.dua.R
import com.example.dua.databinding.FragmentDuaBinding

class DuaFragment : Fragment() {

    private var _binding: FragmentDuaBinding? = null
    val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDuaBinding.inflate(inflater, container, false)

        val safeArgs: DuaFragmentArgs by navArgs()

        binding?.tvDuaArab?.text = safeArgs.textDuaArab
        binding?.tvDuaTajik?.text = safeArgs.textDuaTajik
        (requireActivity() as AppCompatActivity).supportActionBar?.title = safeArgs.textDuaTitle
        return binding!!.root
    }
}