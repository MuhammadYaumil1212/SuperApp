package com.daylab.superapp.presentation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.daylab.superapp.presentation.screens.home.HomeScreen

@Composable
fun NavGraph() {
    val rememberNavController = rememberNavController()
    Surface(modifier = Modifier.fillMaxSize()) {
        NavHost(
            navController = rememberNavController,
            startDestination = NavScreen.HomeScreen.route,
        ) {
            composable(NavScreen.HomeScreen.route) {
                HomeScreen()
            }
        }
    }
}