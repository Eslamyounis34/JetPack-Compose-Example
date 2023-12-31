package com.example.composeexample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeexample.ui.theme.BackGroundColor

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LoginScreen() {
    val backGroundColor = BackGroundColor
    Column(
        Modifier.fillMaxSize().background(backGroundColor),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Login",
            style = MaterialTheme.typography.headlineLarge.copy(
                fontWeight = FontWeight.Bold,
                color = Color.White
            ),
            modifier = Modifier.padding(horizontal = 20.dp)
        )
        var email by remember { mutableStateOf("") }
        OutlinedTextField(
            value = email, onValueChange = { value ->
                email = value
            }, Modifier
                .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 5.dp)
                .fillMaxWidth(), label = { Text("email") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text
            ),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.White,
                unfocusedIndicatorColor = Color.Gray,
                containerColor = backGroundColor,
                focusedLabelColor = Color.White,
                unfocusedLabelColor = Color.White,
                disabledLabelColor = Color.White,
                textColor = Color.White
            )
        )

        var password by remember { mutableStateOf("") }
        OutlinedTextField(
            value = password,
            onValueChange = { value ->
                password = value
            },
            Modifier
                .padding(start = 20.dp, end = 20.dp, top = 5.dp, bottom = 5.dp)
                .fillMaxWidth(),
            label = { Text("password") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.NumberPassword
            ),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.White,
                unfocusedIndicatorColor = Color.Gray,
                containerColor = backGroundColor,
                focusedLabelColor = Color.White,
                unfocusedLabelColor = Color.White,
                textColor = Color.White

            ),
            visualTransformation = PasswordVisualTransformation()
        )
        Button(
            onClick = {},
            modifier = Modifier.wrapContentHeight().fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(top = 25.dp, start = 60.dp, end = 60.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black,
            ),
            shape = RoundedCornerShape(8.dp)
        ) { Text("Login", style = MaterialTheme.typography.headlineSmall) }


    }

}