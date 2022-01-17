package com.pm.framework.sdui.jetpackcomposeexample

import androidx.annotation.DrawableRes

data class Recipe(
    @DrawableRes val imageResource: Int,
    val title: String,
    val ingredients: List<String>
)
