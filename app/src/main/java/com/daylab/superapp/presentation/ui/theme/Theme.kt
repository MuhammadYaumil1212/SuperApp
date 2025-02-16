package com.daylab.superapp.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = BrownPrimary,
    secondary = BrownDark,
    tertiary = BrownAccent,
    background = BrownCoffee,
    surface = BrownChocolate,
    onPrimary = BrownLight,
    onSecondary = BrownSand,
    onTertiary = BrownSand,
    onBackground = BrownLight,
    onSurface = BrownSand
)

private val LightColorScheme = lightColorScheme(
    primary = BrownWood,
    secondary = BrownSand,
    tertiary = BrownLight,
    background = BrownLight,
    surface = BrownLight,
    onPrimary = BrownDark,
    onSecondary = BrownChocolate,
    onTertiary = BrownChocolate,
    onBackground = BrownCoffee,
    onSurface = BrownChocolate
)

@Composable
fun SuperAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme){
        DarkColorScheme
    }else{
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}