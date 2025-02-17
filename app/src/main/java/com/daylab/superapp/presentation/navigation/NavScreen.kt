package com.daylab.superapp.presentation.navigation

sealed class NavScreen(val route: String) {
    data object HomeScreen : NavScreen(route = "home_screen")
}