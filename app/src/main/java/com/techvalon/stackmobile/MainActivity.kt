package com.techvalon.stackmobile

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}

// para funcoes logicas nao deve ser letra maiuscula a primeira
fun calcular () {

}

// composable so para funcoes que vao renderizar componentes na tela
@Composable
fun Cadastro () {
    Column () {
        Text(text = "Hello Benguela")
    }
}

@Composable
fun Home () {
    Column (
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var email by remember { mutableStateOf("admin@admin.com") }
        var password by remember { mutableStateOf("123456") }
        val context = LocalContext.current

        Text(
            text = "Login Page",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(10.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            label = {
                Text(text = "Email")
            },
            maxLines = 1
        )

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text(text = "Password")
            },
            maxLines = 1
        )

        Button(
            onClick = {
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(context, "Preencha todos o campos", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Login efectuado com sucesso", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "Login")
        }


    }
}

/*
@Composable
fun Home () {
    Column (
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Rounded.Home,
            contentDescription = null,
            tint = Color.Blue,
            modifier = Modifier.size(100.dp).padding(10.dp)
        )
        Text("Juliao Kataleko", fontSize = 30.sp)
    }
}
 */

/*
@Composable
fun Home () {
    Column  (
        modifier = Modifier.fillMaxSize().background(Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier.size(200.dp).background(Color.White),
            contentAlignment = Alignment.Center
        ) {

            Box(
                modifier = Modifier.size(120.dp).background(Color.Black)
            ) {

                /*
            Box(
                modifier = Modifier.size(200.dp).background(Color.Green)
            ) {

            }

            Text("Box 1", fontSize = 30.sp)
            Text("Box 2", fontSize = 30.sp)
             */
            }
        }
    }
}
 */

/*
@ExperimentalMaterial3Api
@Composable
fun Home () {
    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Kata Mobile")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Cyan
                ),
                actions = {
                    Icon(
                        imageVector = Icons.Rounded.Home,
                        contentDescription = null
                    )

                    Icon(
                        imageVector = Icons.Rounded.Menu,
                        contentDescription = null
                    )
                }
            )
        },
        bottomBar = {
            BottomAppBar (
                containerColor = Color.Cyan
            ) {

            }
        }
    ) { paddingValues ->
        Column (
            modifier = Modifier.padding(paddingValues).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Julian", fontSize = 20.sp)
            Text("Beliza", fontSize = 20.sp)
            Text("Pesita", fontSize = 20.sp)
            Text("Xibebita", fontSize = 20.sp)
        }
    }
}
 */

// aula 2
/*
@Composable
fun Home () {
    Row (
        modifier = Modifier
            // .width(100.dp)
            // .fillMaxWidth()
            // .height(100.dp)
            // .fillMaxHeight()
            .fillMaxSize()
            .background(color = Color.White),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
        // verticalArrangement = Arrangement.Bottom,
        // horizontalAlignment = Alignment.Start
    ) {
        Surface (
            modifier = Modifier.size(100.dp).weight(3f),
            color = Color.Green
        ) {

        }

        Surface (
            modifier = Modifier.size(100.dp).weight(1f),
            color = Color.Blue
        ) {

        }

    }
}
 */

@Preview(name = "HomePreview", device = "id:Nexus 5")
@Composable
fun HomePreview () {
    Home()
}
