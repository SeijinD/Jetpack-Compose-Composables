package eu.seijindemon.jetpackcomposecomposables.ui.composables.button

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Buttons",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            color = Color.DarkGray
        )

    }
}

@Preview( showBackground = true)
@Composable
fun ButtonsScreenPreview() {
    ButtonsScreen()
}