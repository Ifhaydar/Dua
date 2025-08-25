package com.example.dua.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dua.Dua
import com.example.dua.DuaAdapter
import com.example.dua.DuaDesc
import com.example.dua.R

class HomeFragment : Fragment(), DuaAdapter.Listener {

    private lateinit var adapter: DuaAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var listDua: ArrayList<Dua>

    lateinit var numberDua: Array<Int>
    lateinit var duaName: Array<String>
    lateinit var duaDescArab: Array<String>
    lateinit var duaDescTajik: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = DuaAdapter(listDua)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {

        listDua = arrayListOf<Dua>()

        numberDua = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44)

        duaName = arrayOf(
            getString(R.string.duaName1),
                    getString(R.string.duaName2),
                    getString(R.string.duaName3),
                    getString(R.string.duaName4),
                    getString(R.string.duaName5),
                    getString(R.string.duaName6),
                    getString(R.string.duaName7),
                    getString(R.string.duaName8),
                    getString(R.string.duaName9),
                    getString(R.string.duaName10),
                    getString(R.string.duaName11),
                    getString(R.string.duaName12),
                    getString(R.string.duaName13),
                    getString(R.string.duaName14),
                    getString(R.string.duaName15),
                    getString(R.string.duaName16),
                    getString(R.string.duaName17),
                    getString(R.string.duaName18),
                    getString(R.string.duaName19),
                    getString(R.string.duaName20),
                    getString(R.string.duaName21),
                    getString(R.string.duaName22),
                    getString(R.string.duaName23),
                    getString(R.string.duaName24),
                    getString(R.string.duaName25),
                    getString(R.string.duaName26),
                    getString(R.string.duaName27),
                    getString(R.string.duaName28),
                    getString(R.string.duaName29),
                    getString(R.string.duaName30),
                    getString(R.string.duaName31),
                    getString(R.string.duaName32),
                    getString(R.string.duaName33),
                    getString(R.string.duaName34),
                    getString(R.string.duaName35),
                    getString(R.string.duaName36),
                    getString(R.string.duaName37),
                    getString(R.string.duaName38),
                    getString(R.string.duaName39),
                    getString(R.string.duaName40),
                    getString(R.string.duaName41),
                    getString(R.string.duaName42),
                    getString(R.string.duaName43),
                    getString(R.string.duaName44)
        )

        for (i in numberDua.indices) {

            val dua = Dua(numberDua[i], duaName[i])
            listDua.add(dua)
        }

    }

    override fun onClick(duaDesc: DuaDesc) {
        TODO("Not yet implemented")
    }
}