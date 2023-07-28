@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.composeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeexample.ui.theme.BackGroundColor
import com.example.composeexample.ui.theme.ComposeExampleTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val systemUiController = rememberSystemUiController()
                    val useDarkIcons = !isSystemInDarkTheme()
                    SideEffect {

                        systemUiController.setSystemBarsColor(
                            color = BackGroundColor,
                            darkIcons = !useDarkIcons
                        )
                    }
                    LoginScreen()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyBoxLayout() {
    Box( // used to make card layout
        modifier = Modifier
            .size(120.dp)
            .background(Color.Black)
            .padding(10.dp)
            .clip(RoundedCornerShape(size = 10.dp)) // used to make corners for card
            .background(Color.LightGray)


    ) {
        Text("Hello", Modifier.align(Alignment.TopStart), color = Color.White)
        Text("Android", Modifier.align(Alignment.Center), color = Color.White)
        Text("Cookies", Modifier.align(Alignment.BottomEnd), color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun MyLayout() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyTextField()
        MyButton()
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            MyText()
            MyImage()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyText() {
    Text(
        text = "Hello There .. This is My Compose Text", style = TextStyle(
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center
        ), maxLines = 1
    )
}

@Preview(showBackground = true)
@Composable
fun MyButton() {
    var isEnabled by remember { mutableStateOf(true) }
    Button(
        onClick = {
            isEnabled = !isEnabled
        }, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Black,
            contentColor = Color.White,
            disabledContainerColor = Color.LightGray
        ),
        enabled = isEnabled,
        modifier = Modifier.wrapContentSize()
    ) {

        Text(text = if (isEnabled) "Add To Cart" else "Added")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun MyTextField() {
    var emailAddress by remember { mutableStateOf("") }
    TextField(
        value = emailAddress, onValueChange = {
            emailAddress = it
        },
        label = { Text("email") },
        modifier = Modifier.wrapContentSize()

    )
}

@Preview(showBackground = true)
@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "My Image"
    )
}