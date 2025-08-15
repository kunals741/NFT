package com.kunal.nft.presentation.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kunal.nft.presentation.ui.navigation.AppNavigation

@Composable
fun NFTApp(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppNavigation.OnBoardingScreen
    ) {
        composable<AppNavigation.OnBoardingScreen> {
            OnBoardingScreen(modifier)
        }
    }
}