@file:OptIn(com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi::class)

package com.example.gibarrafoodapp.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.GlideImage
import com.example.gibarrafoodapp.data.model.Restaurant

@Composable
fun RestaurantItem(restaurant: Restaurant, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.width(120.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(110.dp)
                .background(Color(0xFFF8F8F8), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            GlideImage(
                model = restaurant.image,
                contentDescription = restaurant.name,
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape)
            )
        }
        Spacer(Modifier.height(8.dp))
        Text(
            text = restaurant.name,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}
