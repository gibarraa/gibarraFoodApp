package com.example.gibarrafoodapp.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.gibarrafoodapp.data.model.Restaurant

@Composable
fun RestaurantsRow(restaurants: List<Restaurant>) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(restaurants) { r ->
            RestaurantItem(restaurant = r)
        }
    }
}
