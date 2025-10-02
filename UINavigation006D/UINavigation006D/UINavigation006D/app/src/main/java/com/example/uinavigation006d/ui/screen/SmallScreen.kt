package com.example.uinavigation006d.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SmallScreen() {
    column {
        text("soy la pantalla pequeña ")
    }
}



@Preview(showBackground = true, widthDp = 360, name = "Compact Preview")
@Composable
fun SmallScreenPreview() {
    SmallScreen()
}
