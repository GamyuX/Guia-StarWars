package com.example.starwars.ui.planets

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.starwars.repositories.ApiService
import com.example.starwars.repositories.RetrofitClient
import com.example.starwars.repositories.data.Planet
import kotlinx.coroutines.launch

class PlanetsViewModel : ViewModel() {

    private val _planets = MutableLiveData<List<Planet>>()
    val planets: LiveData<List<Planet>> = _planets

    fun fetchPlanets() {
        viewModelScope.launch {
            try {
                val apiService = RetrofitClient.instance.create(ApiService::class.java)
                val response = apiService.getPlanets()
                _planets.postValue(response)
                println("Planetas: ${response.size}")
            } catch (e: Exception) {
                println("Error: ${e.message}")
            }
        }
    }

}