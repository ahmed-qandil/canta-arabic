package io.github.samolego.canta.ui.navigation

sealed class Screen(val route: String) {
    data object Main : Screen("main")
    data object Settings : Screen("settings")
    data object Presets : Screen("presets")
}
