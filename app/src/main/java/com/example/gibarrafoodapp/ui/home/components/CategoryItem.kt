@file:OptIn(com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi::class)

package com.example.gibarrafoodapp.ui.home.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import com.bumptech.glide.integration.compose.GlideImage
import com.example.gibarrafoodapp.data.model.Category

@Composable
fun CategoryItem(category: Category, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.width(96.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GlideImage(
            model = category.image,
            contentDescription = category.name,
            modifier = Modifier
                .size(96.dp)
                .clip(CircleShape)
                .border(
                    width = 6.dp,
                    color = MaterialTheme.colorScheme.primary,
                    shape = CircleShape
                ),
            contentScale = ContentScale.Crop
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = category.name,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}
