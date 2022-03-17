package eu.seijindemon.jetpackcomposecomposables.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import eu.seijindemon.jetpackcomposecomposables.listOfDirections

@Composable
fun HomeScreen(navController: NavController, directions: MutableList<Pair<String, String>>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(directions) { direction ->
            HomeCard(navController = navController, direction = direction)
        }
    }
}

@Composable
fun HomeCard(navController: NavController, direction: Pair<String, String>) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.clickable { navController.navigate(direction.second) },
            text = direction.first,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        )
    }
}

@Preview( showBackground = true)
@Composable
fun HomeScreenPreview() {
    val navController = rememberNavController()
    HomeScreen(navController = navController, directions = listOfDirections())
}