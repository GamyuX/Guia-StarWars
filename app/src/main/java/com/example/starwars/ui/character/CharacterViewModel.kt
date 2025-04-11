package com.example.starwars.ui.character

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.starwars.repositories.ApiService
import com.example.starwars.repositories.RetrofitClient
import kotlinx.coroutines.launch

class CharacterViewModel : ViewModel() {

    fun fetchPeople() {
        viewModelScope.launch {
            try {
                val apiService = RetrofitClient.instance.create(ApiService::class.java)
                val peopleList = apiService.getListPeoples(0).results
            } catch (e: Exception) {
                println("Error: ${e.message}")
            }
        }
    }
}