package com.unlam.feat.ui.util

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Screen(
    val route: String,
    val arguments: List<NamedNavArgument>? = null
) {
    object Main : Screen("main_screen")

    object Splash : Screen("splash_screen")
    object Login : Screen("login_screen")
    object Register : Screen("register_screen")

    object Profile : Screen("profile_screen")
    object Events : Screen("events_screen")
    object Home : Screen("home_screen")
    object SearchList : Screen("search_list_screen")
    object Search : Screen("search_screen")
    object Invite : Screen("invite_screen")


    object ConfigProfilePersonalData : Screen("config_profile_personal_data_screen")
    object ConfigProfileAddress : Screen("config_profile_address_screen")
    object ConfigProfileAvailability : Screen("config_profile_availability_screen")
    object ConfigProfileAdditionalInformation :
        Screen("config_profile_additional_information_screen")

    object ConfigSport : Screen("config_sport_screen")
    object SportData : Screen("sport_data_screen")
    object AddEvent : Screen("event_add_screen")
    object DetailEventHome : Screen("event_detail_home_screen", listOf(
        navArgument("idEvent") { type = NavType.StringType }
    ))

    object Chat : Screen("chat_screen")
}