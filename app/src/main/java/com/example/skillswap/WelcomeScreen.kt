package com.example.skillswap

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// This is the Welcome Screen. It is the first thing the user sees.
// It takes two functions as parameters so it can tell the app when a button is clicked.
@Composable
fun WelcomeScreen(
    onNavigateToLogin: () -> Unit,
    onNavigateToRegister: () -> Unit
) {
    // Column stacks UI elements vertically (one on top of another)
    Column(
        modifier = Modifier
            .fillMaxSize() // Makes the column take up the entire screen
            .padding(24.dp), // Adds a 24dp margin around the edges
        horizontalAlignment = Alignment.CenterHorizontally, // Centers items horizontally
        verticalArrangement = Arrangement.Center // Centers items vertically
    ) {
        // The main App Title
        Text(
            text = "SkillSwap",
            fontSize = 40.sp, // Text size
            fontWeight = FontWeight.Bold, // Makes the text thick and bold
            color = MaterialTheme.colorScheme.primary // Uses the app's main theme color (usually purple/blue)
        )

        // Spacer pushes the next item down by 16dp to create breathing room
        Spacer(modifier = Modifier.height(16.dp))

        // A short description text
        Text(
            text = "Learn and share practical skills with other students.",
            fontSize = 18.sp,
            textAlign = TextAlign.Center // Centers the text if it wraps to a second line
        )

        // Spacer pushes the buttons down by 48dp
        Spacer(modifier = Modifier.height(48.dp))

        // Primary Button (Filled with color)
        Button(
            onClick = onNavigateToRegister, // Tells the app to go to Register when clicked
            modifier = Modifier
                .fillMaxWidth() // Makes the button stretch across the screen
                .height(50.dp) // Sets a nice, clickable height
        ) {
            Text("Create an Account", fontSize = 18.sp)
        }

        // Spacer between the two buttons
        Spacer(modifier = Modifier.height(16.dp))

        // Secondary Button (Outlined)
        OutlinedButton(
            onClick = onNavigateToLogin, // Tells the app to go to Login when clicked
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text("Log In", fontSize = 18.sp)
        }
    }
}