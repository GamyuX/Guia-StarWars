package com.example.starwars.repositories.data

data class PeopleList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<People>
)