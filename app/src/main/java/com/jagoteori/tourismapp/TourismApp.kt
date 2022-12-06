package com.jagoteori.tourismapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jagoteori.tourismapp.ui.navigation.Screen
import com.jagoteori.tourismapp.ui.screen.about_me.AboutMeScreen
import com.jagoteori.tourismapp.ui.screen.detail.DetailScreen
import com.jagoteori.tourismapp.ui.screen.home.HomeScreen

@Composable
fun TourismApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(scaffoldState = scaffoldState) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(paddingValues)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToDetail = { id ->
                        navController.navigate(Screen.Detail.createRoute(id))
                    },
                    navigateToAboutMe = {
                        navController.navigate(Screen.AboutMe.route)
                    }
                )
            }
            composable(Screen.AboutMe.route) {
                AboutMeScreen(
                    navigateBack = {
                        navController.navigateUp()
                    },
                )
            }
            composable(
                route = Screen.Detail.route,
                arguments = listOf(navArgument("id") { type = NavType.IntType }),
            ) {
                val id = it.arguments?.getInt("id") ?: -1
                DetailScreen(
                    id = id,
                    scaffoldState = scaffoldState,
                    scope = scope,
                    navigateBack = {
                        navController.navigateUp()
                    },
                )
            }
        }
    }
}