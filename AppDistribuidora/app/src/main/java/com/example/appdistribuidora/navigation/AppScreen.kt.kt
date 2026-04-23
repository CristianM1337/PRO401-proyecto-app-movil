package com.example.appdistribuidora.navigation

sealed class AppScreen {
    object Login : AppScreen()
    object Menu : AppScreen()
    object Despacho : AppScreen()
}