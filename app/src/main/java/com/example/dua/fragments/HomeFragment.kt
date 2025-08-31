package com.example.dua.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dua.Dua
import com.example.dua.DuaAdapter
import com.example.dua.MainActivity
import com.example.dua.R
import com.example.dua.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _bindind: FragmentHomeBinding? = null
    val binding get() = _bindind!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _bindind = FragmentHomeBinding.inflate(inflater, container, false)

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL, false)

        binding.recyclerView.adapter = DuaAdapter(
            listOf(
                Dua(1, getString(R.string.duaName1), getString(R.string.duaDescArab1), getString(R.string.duaDescTajik1)),
                Dua(2, getString(R.string.duaName2), getString(R.string.duaDescArab2), getString(R.string.duaDescTajik2)),
                Dua(3, getString(R.string.duaName3), getString(R.string.duaDescArab3), getString(R.string.duaDescTajik3)),
                Dua(4, getString(R.string.duaName4), getString(R.string.duaDescArab4), getString(R.string.duaDescTajik4)),
                Dua(5, getString(R.string.duaName5), getString(R.string.duaDescArab5), getString(R.string.duaDescTajik5)),
                Dua(6, getString(R.string.duaName6), getString(R.string.duaDescArab6), getString(R.string.duaDescTajik6)),
                Dua(7, getString(R.string.duaName7), getString(R.string.duaDescArab7), getString(R.string.duaDescTajik7)),
                Dua(8, getString(R.string.duaName8), getString(R.string.duaDescArab8), getString(R.string.duaDescTajik8)),
                Dua(9, getString(R.string.duaName9), getString(R.string.duaDescArab9), getString(R.string.duaDescTajik9)),
                Dua(10, getString(R.string.duaName10), getString(R.string.duaDescArab10), getString(R.string.duaDescTajik10)),
                Dua(11, getString(R.string.duaName11), getString(R.string.duaDescArab11), getString(R.string.duaDescTajik11)),
                Dua(12, getString(R.string.duaName12), getString(R.string.duaDescArab12), getString(R.string.duaDescTajik12)),
                Dua(13, getString(R.string.duaName13), getString(R.string.duaDescArab13), getString(R.string.duaDescTajik13)),
                Dua(14, getString(R.string.duaName14), getString(R.string.duaDescArab14), getString(R.string.duaDescTajik14)),
                Dua(15, getString(R.string.duaName15), getString(R.string.duaDescArab15), getString(R.string.duaDescTajik15)),
                Dua(16, getString(R.string.duaName16), getString(R.string.duaDescArab16), getString(R.string.duaDescTajik16)),
                Dua(17, getString(R.string.duaName17), getString(R.string.duaDescArab17), getString(R.string.duaDescTajik17)),
                Dua(18, getString(R.string.duaName18), getString(R.string.duaDescArab18), getString(R.string.duaDescTajik18)),
                Dua(19, getString(R.string.duaName19), getString(R.string.duaDescArab19), getString(R.string.duaDescTajik19)),
                Dua(20, getString(R.string.duaName20), getString(R.string.duaDescArab20), getString(R.string.duaDescTajik20)),
                Dua(21, getString(R.string.duaName21), getString(R.string.duaDescArab21), getString(R.string.duaDescTajik21)),
                Dua(22, getString(R.string.duaName22), getString(R.string.duaDescArab22), getString(R.string.duaDescTajik22)),
                Dua(23, getString(R.string.duaName23), getString(R.string.duaDescArab23), getString(R.string.duaDescTajik23)),
                Dua(24, getString(R.string.duaName24), getString(R.string.duaDescArab24), getString(R.string.duaDescTajik24)),
                Dua(25, getString(R.string.duaName25), getString(R.string.duaDescArab25), getString(R.string.duaDescTajik25)),
                Dua(26, getString(R.string.duaName26), getString(R.string.duaDescArab26), getString(R.string.duaDescTajik26)),
                Dua(27, getString(R.string.duaName27), getString(R.string.duaDescArab27), getString(R.string.duaDescTajik27)),
                Dua(28, getString(R.string.duaName28), getString(R.string.duaDescArab28), getString(R.string.duaDescTajik28)),
                Dua(29, getString(R.string.duaName29), getString(R.string.duaDescArab29), getString(R.string.duaDescTajik29)),
                Dua(30, getString(R.string.duaName30), getString(R.string.duaDescArab30), getString(R.string.duaDescTajik30)),
                Dua(31, getString(R.string.duaName31), getString(R.string.duaDescArab31), getString(R.string.duaDescTajik31)),
                Dua(32, getString(R.string.duaName32), getString(R.string.duaDescArab32), getString(R.string.duaDescTajik32)),
                Dua(33, getString(R.string.duaName33), getString(R.string.duaDescArab33), getString(R.string.duaDescTajik33)),
                Dua(34, getString(R.string.duaName34), getString(R.string.duaDescArab34), getString(R.string.duaDescTajik34)),
                Dua(35, getString(R.string.duaName35), getString(R.string.duaDescArab35), getString(R.string.duaDescTajik35)),
                Dua(36, getString(R.string.duaName36), getString(R.string.duaDescArab36), getString(R.string.duaDescTajik36)),
                Dua(37, getString(R.string.duaName37), getString(R.string.duaDescArab37), getString(R.string.duaDescTajik37)),
                Dua(38, getString(R.string.duaName38), getString(R.string.duaDescArab38), getString(R.string.duaDescTajik38)),
                Dua(39, getString(R.string.duaName39), getString(R.string.duaDescArab39), getString(R.string.duaDescTajik39)),
                Dua(40, getString(R.string.duaName40), getString(R.string.duaDescArab40), getString(R.string.duaDescTajik40)),
                Dua(41, getString(R.string.duaName41), getString(R.string.duaDescArab41), getString(R.string.duaDescTajik41)),
                Dua(42, getString(R.string.duaName42), getString(R.string.duaDescArab42), getString(R.string.duaDescTajik42)),
                Dua(43, getString(R.string.duaName43), getString(R.string.duaDescArab43), getString(R.string.duaDescTajik43)),
                Dua(44, getString(R.string.duaName44), getString(R.string.duaDescArab44), getString(R.string.duaDescTajik44))

            ), { dua ->
                val action = HomeFragmentDirections.actionHomeFragmentToDuaFragment(dua.duaDescArab, dua.duaDescTajik, dua.duaName)
                findNavController().navigate(action)
            }
        )

        (requireActivity() as MainActivity).updateToolbarTitle("Дуоҳо")

        return binding.root
    }
}

