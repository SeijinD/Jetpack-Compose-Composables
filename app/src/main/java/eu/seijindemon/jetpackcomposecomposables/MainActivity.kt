package eu.seijindemon.jetpackcomposecomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import eu.seijindemon.jetpackcomposecomposables.ui.home.HomeScreen
import eu.seijindemon.jetpackcomposecomposables.ui.theme.JetpackComposeComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeComposablesTheme {
                NavigationComponent()
            }
        }
    }
}

@Composable
fun NavigationComponent() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable(route = "home") { HomeScreen(navController = navController, directions = listOfDirections()) }
//        composable(route = "") {}
//        composable(route = "") {}
//        composable(route = "") {}
//        composable(route = "") {}
    }
}

fun listOfDirections(): MutableList<Pair<String, String>> {
    val listOfDirections: MutableList<Pair<String, String>> = mutableListOf()

    listOfDirections.add(Pair("1", ""))
    listOfDirections.add(Pair("2", ""))
    listOfDirections.add(Pair("3", ""))
    listOfDirections.add(Pair("4", ""))


    return listOfDirections
}