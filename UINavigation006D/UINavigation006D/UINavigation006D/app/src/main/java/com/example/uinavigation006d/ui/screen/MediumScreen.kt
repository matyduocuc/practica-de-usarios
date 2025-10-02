package com.example.uinavigation006d.ui.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MediumScreen() {
    Row {
        Text("Soy la pantalla mediana ")
    }
}





@Preview(showBackground = true, widthDp = 600, name = "Medium Preview")
@Composable
fun MediumScreenPreview() {
    MediumScreen()
}
