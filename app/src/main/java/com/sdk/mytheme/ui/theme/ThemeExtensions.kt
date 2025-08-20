package com.sdk.mytheme.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color

val MaterialTheme.appColors: AppColors
    @Composable
    @ReadOnlyComposable
    get() = AppColors

val MaterialTheme.spacing: AppDimensions
    @Composable
    @ReadOnlyComposable
    get() = AppDimensions