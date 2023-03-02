package com.example.amsstudent.Navigation

sealed class Screen(val route : String){
    object Login : Screen(route = "Login")
    object Authentication : Screen(route = "Authentication")
}