package com.vdemelo.pulsepoint.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vdemelo.pulsepoint.ui.home.chat.ChatScreen
import com.vdemelo.pulsepoint.ui.home.HomeScreen
import com.vdemelo.pulsepoint.ui.onboarding.login.LoginScreen
import com.vdemelo.pulsepoint.ui.onboarding.register.RegisterScreen
import com.vdemelo.pulsepoint.ui.onboarding.welcome.WelcomeScreen
import com.vdemelo.pulsepoint.ui.home.settings.SettingsScreen

@Composable
fun AppNavigation(
    navController: NavHostController = rememberNavController()
    ) {
    NavHost(navController = navController, startDestination = NavRoutes.WELCOME) {
        composable(NavRoutes.WELCOME) {
            WelcomeScreen(navController = navController)
        }
        composable(NavRoutes.LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(NavRoutes.REGISTER) {
            RegisterScreen(navController = navController)
        }
        composable(NavRoutes.HOME) {
            HomeScreen(navController = navController)
        }
        composable(NavRoutes.CHAT) {
            ChatScreen(navController = navController)
        }
        composable(NavRoutes.SETTINGS) {
            SettingsScreen(navController = navController)
        }
    }
}
