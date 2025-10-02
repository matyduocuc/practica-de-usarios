package com.example.uinavigation006d.ui.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun LargeScreen() {
    Row {
        Text("Soy la pantalla grande ")
    }
}



@Preview(showBackground = true, widthDp = 840, name = "Expanded Preview")
@Composable
fun LargeScreenPreview() {
    LargeScreen()
}
