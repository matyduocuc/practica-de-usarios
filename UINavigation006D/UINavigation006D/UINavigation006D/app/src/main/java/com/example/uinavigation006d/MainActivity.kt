package com.example.uinavigation006d

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.uinavigation006d.ui.theme.UINavigation006DTheme
import com.example.uinavigation006d.ui.utils.currentWindowSizeClass
import com.example.uinavigation006d.ui.screen.AdaptiveApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UINavigation006DTheme {
                val windowSizeClass = currentWindowSizeClass()
                AdaptiveApp(windowSizeClass)
            }
        }
    }
}