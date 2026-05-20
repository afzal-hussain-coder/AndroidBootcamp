package com.afzal.androidbootcamp.day2.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterViewModel : ViewModel() {

    // MutableStateFlow to hold the current count
    private val _count = MutableStateFlow(0)

    // Expose the count as a StateFlow to read-only access
    val count = _count.asStateFlow()

    // Function to increment the count
    fun incrementCount() {
        _count.value++
    }

    //Functtion to decrement the count
    fun decrementCount() {
        _count.value--
    }

}