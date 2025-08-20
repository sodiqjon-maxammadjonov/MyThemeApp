package com.sdk.mytheme.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

object AppDimensions {
    val SpaceXS = 4.dp
    val SpaceS = 8.dp
    val SpaceM = 16.dp
    val SpaceL = 24.dp
    val SpaceXL = 32.dp
    val SpaceXXL = 48.dp

    val ButtonHeight = 48.dp
    val IconSize = 24.dp
    val AvatarSize = 40.dp

    val RadiusS = 8.dp
    val RadiusM = 12.dp
    val RadiusL = 16.dp
}

val LocalAppDimensions = staticCompositionLocalOf { AppDimensions }