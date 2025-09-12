package com.example.gibarrafoodapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val AppLightColors = lightColorScheme(
    primary = RedPrimary,
    onPrimary = Color.White,
    secondary = GreenAccent,
    onSecondary = Color.White,

    background = SurfaceSoft,
    onBackground = TextPrimary,
    surface = SurfaceSoft,
    onSurface = TextPrimary,

    surfaceVariant = SurfaceSoftVariant,
    outline = TextSecondary
)

@Composable
fun GibarraFoodAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppLightColors,
        typography = Typography, // viene de tu Type.kt del template
        content = content
    )
}
