package com.example.hitime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hitime.ui.theme.HiTimeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HiTimeTheme {
                // A surface container using the 'background' color from the theme
                MainComponent()
            }
        }
    }
}

@Composable
fun MainComponent() {

    Column(verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.Start,
    modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF495E57))) {

        Text(text = "Hi-tea",
            fontSize = 32.sp,
            color = Color(0xFFC0A313),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
            )

        Text(text = "Chicago",
            fontSize = 24.sp,
            color = Color(0xFFC0A313),
            modifier = Modifier.padding(start = 20.dp)
            )


        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {

            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
            ) {
                Text(text = "Order", color = Color.White)
            }

            Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null, Modifier.height(100.dp))


        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HiTimeTheme {
        MainComponent()
    }
}