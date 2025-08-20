package com.sdk.mytheme.presentation.components

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdk.mytheme.R
@Composable
fun AnimatedThemeToggle(
    isDarkTheme: Boolean,
    onToggle: () -> Unit,
    modifier: Modifier = Modifier
) {
    val infiniteTransition = rememberInfiniteTransition(label = "theme_transition")

    // Rotation animation
    val rotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(20000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "rotation"
    )

    // Scale animation on toggle
    var isPressed by remember { mutableStateOf(false) }
    val scale by animateFloatAsState(
        targetValue = if (isPressed) 0.85f else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        ),
        label = "scale"
    )

    // Color transitions
    val sunColor by animateColorAsState(
        targetValue = if (isDarkTheme) Color(0xFFFDCB6E) else Color(0xFFF39C12),
        animationSpec = tween(600, easing = FastOutSlowInEasing),
        label = "sun_color"
    )

    val moonColor by animateColorAsState(
        targetValue = if (isDarkTheme) Color(0xFF74B9FF) else Color(0xFF6C5CE7),
        animationSpec = tween(600, easing = FastOutSlowInEasing),
        label = "moon_color"
    )

    // Background gradient
    val backgroundGradient = Brush.radialGradient(
        colors = if (isDarkTheme) {
            listOf(moonColor.copy(alpha = 0.3f), Color.Transparent)
        } else {
            listOf(sunColor.copy(alpha = 0.3f), Color.Transparent)
        },
        radius = 80f
    )

    Box(
        modifier = modifier
            .size(48.dp)
            .background(backgroundGradient, CircleShape)
            .clip(CircleShape)
            .clickable {
                isPressed = true
                onToggle()
            }
            .scale(scale),
        contentAlignment = Alignment.Center
    ) {
        AnimatedContent(
            targetState = isDarkTheme,
            transitionSpec = {
                fadeIn(animationSpec = tween(400)) + scaleIn(
                    animationSpec = tween(400),
                    initialScale = 0.8f
                ) togetherWith fadeOut(animationSpec = tween(200)) + scaleOut(
                    animationSpec = tween(200),
                    targetScale = 0.8f
                )
            },
            label = "icon_transition"
        ) { darkTheme ->
            if (darkTheme) {
                Icon(
                    painter = painterResource(id = R.drawable.moon),
                    contentDescription = "Switch to light theme",
                    tint = moonColor,
                    modifier = Modifier
                        .size(24.dp)
                        .rotate(rotation * 0.5f)
                )
            } else {
                Icon(
                    painter = painterResource(id = R.drawable.sun),
                    contentDescription = "Switch to dark theme",
                    tint = sunColor,
                    modifier = Modifier
                        .size(24.dp)
                        .rotate(rotation)
                )
            }
        }

        LaunchedEffect(isPressed) {
            if (isPressed) {
                kotlinx.coroutines.delay(150)
                isPressed = false
            }
        }
    }
}