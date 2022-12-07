package com.example.marvel_app_compose.model

import androidx.compose.ui.graphics.Color
import com.example.marvel_app_compose.R


data class MarvelHero(
    val name: String,
    val imageId: Int,
    val color: Color

)


val heroes = listOf(
    MarvelHero(
        "Deadpool",
        R.drawable.deadpool,
        Color(0xff6a1e29)
    ),
    MarvelHero(
        "Thanos",
        R.drawable.thanos,
        Color(0xff4e407a)
    ),
    MarvelHero(
        "Spider-man",
        R.drawable.spider_man,
        Color(0xffb5001a)
    ),
    MarvelHero(
        "Tor",
        R.drawable.tor,
        Color(0xff009fbf)
    ),
    MarvelHero(
        "Captain America (House of M)",
        R.drawable.captain_america,
        Color(0xffd4ae1b)
    ),
)