package com.example.ege_app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ege_app.ui.theme.MydarkPurple
import com.example.ege_app.R
import com.example.ege_app.ui.theme.GreyForText
import com.example.ege_app.ui.theme.MyFont

@Composable
fun Login(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary),

        ) {
        var textemail = "Электронная почта"
        val textpassword = "Пароль"
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }


        Spacer(Modifier.height(80.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.padding(bottom = 16.dp)
                .clip(shape = RoundedCornerShape(19.dp))
                .background(color = MydarkPurple,)



                .size(72.dp)



            ) {
            Image(
                painter = painterResource(R.drawable.ic_graduation),
                contentDescription = null
            )
        }

        Text(
            "ЕГЭ.Pocket",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Spacer(modifier = Modifier.height(120.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .padding(bottom = 12.dp)
                .height(58.dp)
                .fillMaxWidth()
                .padding(horizontal = 20.dp), shape = RoundedCornerShape(20),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = MaterialTheme.colorScheme.tertiary,
                focusedContainerColor = MaterialTheme.colorScheme.tertiary,
                unfocusedBorderColor = MaterialTheme.colorScheme.onTertiary,
                focusedBorderColor = MaterialTheme.colorScheme.onTertiary,
                cursorColor = MaterialTheme.colorScheme.onTertiary

            ),
            placeholder = {
                Text(
                    textemail,
                    color = GreyForText,
                    fontSize = 16.sp,
                    fontFamily = MyFont
                )
            },
            leadingIcon = {
                Image(
                    painter = painterResource(R.drawable.ic_mail),
                    contentDescription = ""
                )
            }
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier
                .padding(bottom = 20.dp)
                .height(58.dp)
                .fillMaxWidth()
                .padding(horizontal = 20.dp), shape = RoundedCornerShape(20),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = MaterialTheme.colorScheme.tertiary,
                focusedContainerColor = MaterialTheme.colorScheme.tertiary,
                unfocusedBorderColor = MaterialTheme.colorScheme.onTertiary,
                focusedBorderColor = MaterialTheme.colorScheme.onTertiary,
                cursorColor = MaterialTheme.colorScheme.onTertiary

            ),
            placeholder = {
                Text(
                    textpassword,
                    color = GreyForText,
                    fontSize = 16.sp,
                    fontFamily = MyFont
                )
            },
            leadingIcon = {
                Image(
                    painter = painterResource(R.drawable.ic_lock),
                    contentDescription = ""
                )
            },
            trailingIcon = {
                Image(
                    painter = painterResource(R.drawable.ic_eye),
                    contentDescription = null
                )
            }
        )
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(58.dp)
                .padding(horizontal = 20.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MydarkPurple,
                contentColor = MaterialTheme.colorScheme.secondary
            )
        ) {
            Text(
                "Зарегистрироваться",
                fontSize = 16.sp,
                fontFamily = MyFont
            )
        }
        Column(
            modifier = Modifier
                .padding(bottom = 77.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
        ) {
            Text(
                "Войти",
                color = MydarkPurple,
                fontSize = 16.sp,
                fontFamily = MyFont,
                modifier = Modifier.clickable {})
        }

    }


}