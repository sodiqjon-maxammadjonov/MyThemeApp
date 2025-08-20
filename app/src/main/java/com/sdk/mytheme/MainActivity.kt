package com.sdk.mytheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sdk.mytheme.presentation.screens.MainScreen
import com.sdk.mytheme.ui.theme.AppTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdk.mytheme.ui.theme.ThemeManager

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val themeManager: ThemeManager = viewModel()
            AppTheme(darkTheme = themeManager.isDarkTheme) {
                MainScreen(themeManager = themeManager)
            }
        }
    }
}