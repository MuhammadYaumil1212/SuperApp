package com.daylab.superapp.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.daylab.superapp.presentation.components.AppToolbar
import com.daylab.superapp.presentation.ui.theme.BrownLight

@Composable
fun HomeScreen() {
    Scaffold(topBar = { AppToolbar() }) { innerPadding->
        Column(
            Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
                .background(BrownLight)
                .padding(innerPadding)
        ) {
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}