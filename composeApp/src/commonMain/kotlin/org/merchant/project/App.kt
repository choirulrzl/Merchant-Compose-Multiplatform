package org.merchant.project

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.merchant.project.ui.component.BottomBar
import org.merchant.project.ui.screen.CatalogScreen
import org.merchant.project.ui.screen.HomeScreen
import org.merchant.project.ui.screen.LendingScreen
import org.merchant.project.ui.screen.SettingsScreen

@Composable
@Preview
fun App() {
    var currentScreen by remember { mutableStateOf<Screen>(Screen.Home) }
    MaterialTheme {
        Scaffold(
            bottomBar = {
                BottomBar(
                    currentScreen = currentScreen,
                    onNavigate = { screen ->
                        currentScreen = screen
                    }
                )
            }
        ) { innerPadding ->
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                color = Color(0xDDE1F7).copy(1f)
            ) {
                when (currentScreen) {
                    is Screen.Home -> HomeScreen()
                    is Screen.Catalog -> CatalogScreen()
                    is Screen.Lending -> LendingScreen()
                    is Screen.Settings -> SettingsScreen()
                }
            }
        }
    }
}