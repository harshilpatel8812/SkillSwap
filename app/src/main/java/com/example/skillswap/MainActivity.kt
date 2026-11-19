package com.example.skillswap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.skillswap.ui.theme.SkillSwapTheme

// MainActivity is the entry point of your app. It loads the very first screen.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Allows the app to draw behind the system status bar and navigation bar
        enableEdgeToEdge()

        setContent {
            // SkillSwapTheme applies the colors and fonts defined for your app
            SkillSwapTheme {
                // Scaffold provides a basic layout structure (like handling screen edges)
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // navController is the "brain" that manages moving between screens
                    val navController = rememberNavController()

                    // NavHost is the container that holds all your screens
                    NavHost(
                        navController = navController,
                        startDestination = "welcome", // The screen the app opens to first
                        modifier = Modifier.padding(innerPadding) // Applies the Scaffold's padding
                    ) {
                        // Define the Welcome Screen
                        composable("welcome") {
                            WelcomeScreen(
                                // When this button is clicked, navigate to "login" and pass the navController
                                onNavigateToLogin = { navController.navigate("login") },
                                // When this button is clicked, navigate to "register"
                                onNavigateToRegister = { navController.navigate("register") }
                            )
                        }

                        // Define the Login Screen
                        composable("login") {
                            LoginScreen()
                        }

                        // Define the Register Screen
                        composable("register") {
                            RegisterScreen()
                        }
                    }
                }
            }
        }
    }
}