package eu.seijindemon.jetpackcomposecomposables.ui.composables.material.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Button1() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Button")
    }
}

@Composable
fun OutlinedButton1() {
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text(text = "OutlinedButton")
    }
}

@Composable
fun TextButton1() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "TextButton")
    }
}

@Composable
fun IconButton1() {
    IconButton(
        onClick = { /*TODO*/ }
    ) {
        Icon(
            modifier = Modifier
                .background(color = Color.Gray, shape = RoundedCornerShape(8.dp))
                .padding(all = 8.dp),
            imageVector = Icons.Filled.Favorite,
            contentDescription = "Localized description",
            tint = Color.Red
        )
    }
}

@Composable
fun IconToggleButton1() {
    var state by remember { mutableStateOf(false) }
    IconToggleButton(checked = false, onCheckedChange = { state = !state }) {
        if (state) {
            Icon(
                modifier = Modifier
                    .background(color = Color.Gray, shape = RoundedCornerShape(8.dp))
                    .padding(all = 8.dp),
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Localized description",
                tint = Color.Red
            )
        } else {
            Icon(
                modifier = Modifier
                    .background(color = Color.Gray, shape = RoundedCornerShape(8.dp))
                    .padding(all = 8.dp),
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Localized description",
                tint = Color.Blue
            )
        }
    }
}