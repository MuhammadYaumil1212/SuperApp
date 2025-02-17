package com.daylab.superapp.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.daylab.superapp.presentation.components.AppBanner
import com.daylab.superapp.presentation.components.AppToolbar
import com.daylab.superapp.presentation.ui.theme.BrownLight

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { AppToolbar() },
    ) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .background(BrownLight)
                .padding(innerPadding)
        ) {
            AppBanner(
                title = "Welcome Back!",
                description = "Enjoy yourself now",
                imageUrl = "https://picsum.photos/200",
            )
            
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}