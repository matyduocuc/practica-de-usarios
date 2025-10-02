package com.example.uinavigation006d.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass

@Composable
fun AdaptiveApp(windowSizeClass: WindowSizeClass) {
    when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> SmallScreen()
        WindowWidthSizeClass.Medium  -> MediumScreen()
        WindowWidthSizeClass.Expanded -> LargeScreen()
    }
}
