package eu.seijindemon.jetpackcomposecomposables.ui.composables.material.button

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
fun ButtonScreen(title: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            color = Color.DarkGray
        )
        Button1()
        OutlinedButton1()
        TextButton1()
        IconButton1()
        IconToggleButton1()
    }
}

@Preview( showBackground = true)
@Composable
fun ButtonScreenPreview() {
    ButtonScreen(title = "Buttons")
}