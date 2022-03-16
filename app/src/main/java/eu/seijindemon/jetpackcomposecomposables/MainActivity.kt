package eu.seijindemon.jetpackcomposecomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import eu.seijindemon.jetpackcomposecomposables.ui.theme.JetpackComposeComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeComposablesTheme {

            }
        }
    }
}
