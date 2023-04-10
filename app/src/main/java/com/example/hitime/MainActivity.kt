package com.example.hitime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.hitime.ui.theme.HiTimeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HiTimeTheme {
                // A surface container using the 'background' color from the theme
                UpperPanel()
                LowerPanel()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HiTimeTheme {
        UpperPanel()
        LowerPanel()
    }
}