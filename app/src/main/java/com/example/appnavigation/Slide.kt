package com.example.appnavigation

import androidx.annotation.DrawableRes

data class Slide(
    @DrawableRes val imageRes: Int,
    val caption: String
)