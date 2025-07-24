package org.merchant.project

sealed class Screen {
    object Home : Screen()
    object Catalog : Screen()
    object Lending : Screen()
    object Settings : Screen()
}