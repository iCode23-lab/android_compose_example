package com.pm.framework.sdui.jetpackcomposeexample

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun RecipeList(recipes: List<Recipe>) {
    LazyColumn {
        items(recipes) { recipe ->
            RecipeCard(recipe, Modifier.padding(16.dp))
        }
    }

}