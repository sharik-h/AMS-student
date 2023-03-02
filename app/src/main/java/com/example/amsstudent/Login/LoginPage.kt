package com.example.amsstudent.Login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.amsstudent.Navigation.Screen
import com.example.amsstudent.R

@Composable
fun LoginPage(navController: NavHostController) {
    var regNo by remember { mutableStateOf("") }
    var className by remember { mutableStateOf("") }

    Column(Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Login",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(30.dp))
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp))
        {
            Text(text = "Reg No.", color = Color.Gray)
            OutlinedTextField(
                value = regNo,
                onValueChange = { regNo = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20)),
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.register_white),
                        contentDescription = "",
                        modifier = Modifier.size(25.dp)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Blue,
                    backgroundColor = Color.LightGray,
                    cursorColor = Color.Blue
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Class", color = Color.Gray)
            OutlinedTextField(
                value = className,
                onValueChange = { className = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20)),
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.class_white),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Blue,
                    backgroundColor = Color.LightGray,
                    cursorColor = Color.Blue
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        if (regNo.length != 0 && className.length != 0){
                            navController.navigate(route = Screen.Authentication.route)
                        }
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Login", color = Color.White)
                }
            }
        }
    }
}