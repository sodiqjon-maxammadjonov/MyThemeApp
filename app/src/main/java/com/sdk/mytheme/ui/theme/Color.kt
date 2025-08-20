package com.sdk.mytheme.ui.theme

import androidx.compose.ui.graphics.Color

object AppColors {
    val Brand100 = Color(0xFFF3F0FF)
    val Brand500 = Color(0xFF6C5CE7)
    val Brand900 = Color(0xFF5A4FCF)

    val Gray50 = Color(0xFFF8F9FA)
    val Gray100 = Color(0xFFE9ECEF)
    val Gray900 = Color(0xFF212529)

    // Semantic Colors
    val Success = Color(0xFF00B894)
    val Warning = Color(0xFFFDCB6E)
    val Error = Color(0xFFE17055)
    val Info = Color(0xFF0984E3)
}

internal val LightColors = lightColorScheme(
    primary = AppColors.Brand500,
    onPrimary = Color.White,
    secondary = AppColors.Brand100,
    background = Color.White,
    surface = AppColors.Gray50,
    onSurface = AppColors.Gray900,
    error = AppColors.Error
)

internal val DarkColors = darkColorScheme(
    primary = AppColors.Brand500,
    onPrimary = Color.White,
    secondary = AppColors.Brand900,
    background = Color(0xFF121212),
    surface = Color(0xFF1E1E1E),
    onSurface = Color(0xFFE1E1E1),
    error = AppColors.Error
)
