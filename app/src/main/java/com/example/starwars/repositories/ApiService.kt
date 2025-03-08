package com.example.starwars.repositories

import com.example.starwars.repositories.data.People
import com.example.starwars.repositories.data.Planets
import com.example.starwars.repositories.data.SpaceShips
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("starships/{id}")
    suspend fun getSpaceShips(@Path("id") spaceShipsId: Int): SpaceShips

    @GET("people/{id}")
    suspend fun getPeople(@Path("id") peopleId: Int): People

    @GET("planets/{id}")
    suspend fun getPlanets(@Path("id") planetsId: Int): Planets
}
