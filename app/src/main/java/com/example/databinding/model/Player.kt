package com.example.databinding.model

data class Player(
    val firstName: String? = "Fredd",
    val secondName: String? = "Beal",
    var age: Int = 24,
    var height: String = "6ft 1",
    var gamesPlayed: Int = 44,
    var goalsScored: Int = 9,
    var position: String = "Midfield")