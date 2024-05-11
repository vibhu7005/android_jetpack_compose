package com.example.android_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_jetpack_compose.ui.theme.Android_jetpack_composeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_jetpack_composeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Text("Hello")
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android_jetpack_composeTheme {
        MainScreen()
    }
}