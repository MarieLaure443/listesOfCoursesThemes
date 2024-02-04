package com.example.listesofcoursesthemes.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Cour(
   @StringRes val name: Int,
   val availableCourses: Int,
   @DrawableRes val imageRes: Int
)
