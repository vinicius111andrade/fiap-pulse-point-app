package com.vdemelo.pulsepoint.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vdemelo.pulsepoint.ui.onboarding.welcome.WelcomeScreen

@Composable
fun AppNavigation(
    navController: NavHostController = rememberNavController()
    ) {
    NavHost(navController = navController, startDestination = NavRoutes.WELCOME) {
        composable(NavRoutes.WELCOME) {
            WelcomeScreen(navController = navController)
        }
        composable(NavRoutes.LOGIN) {
            WelcomeScreen(navController = navController)
        }
        composable(NavRoutes.SIGNUP) {
            WelcomeScreen(navController = navController)
        }
        composable(NavRoutes.REGISTER) {
            WelcomeScreen(navController = navController)
        }
        composable(NavRoutes.HOME) {
            WelcomeScreen(navController = navController)
        }
        composable(NavRoutes.CHAT) {
            WelcomeScreen(navController = navController)
        }
        composable(NavRoutes.SETTINGS) {
            WelcomeScreen(navController = navController)
        }
    }
}
