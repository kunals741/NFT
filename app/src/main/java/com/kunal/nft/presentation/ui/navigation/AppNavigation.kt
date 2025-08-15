package com.kunal.nft.presentation.ui.navigation

import kotlinx.serialization.Serializable

sealed class AppNavigation {
    @Serializable
    object OnBoardingScreen : AppNavigation()

    @Serializable
    object HomeScreen : AppNavigation()
}
