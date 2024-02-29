package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.material.icons.Icons

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
//import coil.compose.rememberImagePainter
import com.example.compose.ui.theme.ComposeTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.constraintlayout.compose.Visibility


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                SampleScreen()
            }
        }
    }
}

//@Composable
//fun LoginScreen() {
//
//    val textFieldShape = RoundedCornerShape(16.dp)
//
//    var login by remember { mutableStateOf("")}
//    var password by remember { mutableStateOf("")}
//    var passwordIsVisible by remember { mutableStateOf(false)}
//    Surface {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp)
//        ) {
//            val imageURL = "https://img.freepik.com/free-photo/computer-security-with-login-password-padlock_107791-16191.jpg?t=st=1708356344~exp=1708356944~hmac=1167a9834aca1f59ad54a8994f5e945af93c0cc9da49986c32422aa4d1a206fc"
//            Image(painter = rememberImagePainter(data = imageURL),
//                contentDescription = "Login preview image",
//                modifier = Modifier.size(350.dp)
//            )
//            Text(
//                text = "Вход",
//                style = MaterialTheme.typography.labelLarge,
//                color = Color.Black,
//                textAlign = TextAlign.Start,
//                modifier = Modifier
//                    .fillMaxWidth()
//            )
//            Spacer(modifier = Modifier.height(16.dp))
//            OutlinedTextField(value = login,
//                onValueChange = { login = it },
//                label = { Text(text = "Ваш логин")},
//                modifier = Modifier
//                    .fillMaxWidth(),
//                shape = textFieldShape
//            )
//            Spacer(modifier = Modifier.height(16.dp))
//            OutlinedTextField(
//                label = { Text(text = "Ваш пароль")},
//                value = password,
//                onValueChange = { password = it },
//                modifier = Modifier
//                    .fillMaxWidth(),
//                visualTransformation = if (passwordIsVisible) VisualTransformation.None
//                else PasswordVisualTransformation(),
//                shape = textFieldShape,
//                trailingIcon = {
//                    IconButton(onClick = { passwordIsVisible = !passwordIsVisible}) {
//                        Icon(imageVector = if (passwordIsVisible)
//                            Icons.Filled.VisibilityOff else Icons.Filled.Visibility,
//                            contentDescription = "Toggle Icon"
//
//                        )
//                    }
//                }
//            )
//            Spacer(modifier = Modifier.height(16.dp))
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Divider(modifier = Modifier.weight(1f))
//                Text("Другое",
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.weight(1f))
//                Divider(modifier = Modifier.weight(1f))
//            }
//        }
//    }
//}
//
//
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTheme {
        SampleScreen()
    }
}
//
//private val Any.Visibility: ImageVector
//    get() {
//        TODO("Not yet implemented")
//    }
//private val Any.VisibilityOff: ImageVector
//    get() {}
//val AppTypography = Typography(
//    labelLarge = TextStyle(
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        letterSpacing = 0.sp
//    ),
//    bodyMedium = TextStyle(
//        fontSize = 24.sp,
//        fontWeight = FontWeight.Normal,
//        letterSpacing = 0.sp
//    ),
//    displayMedium = TextStyle(
//        fontSize = 16.sp,
//        fontWeight = FontWeight.Medium,
//        letterSpacing = 1.25.sp
//    )
//)

@Composable
fun SampleScreen(){
    val itemList = List(100){index -> "Kontakt ${index+1}"}
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn{
            item {
                Text("Список контактов", textAlign = TextAlign.Center)
            }
            item{
                LazyRow{
                    item{
                        Image(painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "Arrow",
                            modifier = Modifier.size(24.dp)
                            )
                    }
                    item(itemList){
                        Text(
                            text = "My Contacts",
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            }
            items(itemList){item ->
                Text(text = item,
                    modifier = Modifier.padding(16.dp))
            }
        }
    }
}