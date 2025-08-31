package com.example.dua

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TasbihViewModel: ViewModel() {

    private val _counter = MutableLiveData<Int>().apply {value = 0}
    val counter: LiveData<Int> = _counter

    fun counterTasbih() {
        _counter.value = (_counter.value?: 0) + 1
    }

    fun clearCounter() {
        _counter.value = 0
    }
}