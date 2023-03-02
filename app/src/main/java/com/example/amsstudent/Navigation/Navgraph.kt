package com.example.amsstudent.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.amsstudent.Login.Authentication
import com.example.amsstudent.Login.LoginPage

@Composable
fun NavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ){
        composable(route = Screen.Login.route){
            LoginPage(navController = navController)
        }
        composable(route = Screen.Authentication.route){
            Authentication()
        }
    }
}