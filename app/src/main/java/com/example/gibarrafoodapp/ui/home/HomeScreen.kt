package com.example.gibarrafoodapp.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gibarrafoodapp.data.mock.MockData
import com.example.gibarrafoodapp.ui.home.components.CategoriesRow
import com.example.gibarrafoodapp.ui.home.components.HomeTopBar
import com.example.gibarrafoodapp.ui.home.components.RestaurantsRow

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            HomeTopBar(
                userName = "Gael",
                onLogout = { }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.surface)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                text = "Nuestras categorias",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(Modifier.height(12.dp))
            CategoriesRow(categories = MockData.categories)

            Spacer(Modifier.height(24.dp))

            Text(
                text = "Busca los mejores\nrestaurantes",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(Modifier.height(12.dp))
            RestaurantsRow(restaurants = MockData.restaurants)

            Spacer(Modifier.height(24.dp))

            Text(
                text = "Nuestras mejores comidas",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(Modifier.height(12.dp))
        }
    }
}
