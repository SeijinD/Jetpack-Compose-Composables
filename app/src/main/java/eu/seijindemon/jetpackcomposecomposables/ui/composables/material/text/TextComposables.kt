package eu.seijindemon.jetpackcomposecomposables.ui.composables.material.text

import android.util.Log
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun Text1() {
    Text(text = "Simple Text")
}

@Composable
fun Text2() {
    Text(
        text = "Simple Text with attributes",
        fontSize = 15.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Blue
    )
}

@Composable
fun Text3() {
    Text(
        text = "Simple Text with style",
        style = TextStyle(
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Red
        )
    )
}

@Composable
fun Text4() {
    Text(
        text = "Simple Text with max line and overFlow Ellipsis, TestTestTestTestTestTest",
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun Text5() {
    SelectionContainer {
        Text("Selectable Text")
    }
}

@Composable
fun Text6() {
    ClickableText(
        text = AnnotatedString("Clickable Text"),
        onClick = { offset ->
            Log.d("ClickableText", "$offset -th character is clicked.")
        }
    )
}