package com.example.skillswap

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

// This is a temporary placeholder for the Login screen.
@Composable
fun LoginScreen() {
    // Box allows us to easily center the text on the screen
    Box(
        modifier = Modifier.fillMaxSize(), // Fills the whole screen
        contentAlignment = Alignment.Center // Centers the text perfectly
    ) {
        Text("Login Screen - Coming Soon")
    }
}