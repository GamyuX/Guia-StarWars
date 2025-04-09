package com.example.starwars.ui.planet

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.starwars.repositories.ApiService
import com.example.starwars.repositories.RetrofitClient
import com.example.starwars.repositories.data.People
import kotlinx.coroutines.launch

class PlanetViewModel : ViewModel() {

    fun fetchPeople() {
        viewModelScope.launch {
            try {
                val apiService = RetrofitClient.instance.create(ApiService::class.java)
                val people: People = apiService.getPeople(1)
                println("User: ${people.name}")
            } catch (e: Exception) {
                println("Error: ${e.message}")
            }
        }
    }
}