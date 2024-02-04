package com.example.listesofcoursesthemes.data
import com.example.listesofcoursesthemes.R
import com.example.listesofcoursesthemes.model.Cour

data class DataSource(
    val Cours: List<Cour> = listOf(
        Cour(R.string.architecture, 58, R.drawable.architecture),
        Cour(R.string.crafts, 121, R.drawable.crafts),
        Cour(R.string.business, 78, R.drawable.business),
        Cour(R.string.culinary, 118, R.drawable.culinary),
        Cour(R.string.design, 423, R.drawable.design),
        Cour(R.string.fashion, 92, R.drawable.fashion),
        Cour(R.string.film, 165, R.drawable.film),
        Cour(R.string.gaming, 164, R.drawable.gaming),
        Cour(R.string.lifestyle, 305, R.drawable.lifestyle),
        Cour(R.string.music, 212, R.drawable.music),
        Cour(R.string.painting, 172, R.drawable.painting),
        Cour(R.string.photography, 321, R.drawable.photography),
        Cour(R.string.tech, 118, R.drawable.tech)
    )
)

