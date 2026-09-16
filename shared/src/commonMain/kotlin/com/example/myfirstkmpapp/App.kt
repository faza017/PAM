package com.example.myfirstkmpapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp, vertical = 32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                " Nama : M Faza Prasetyo",
                fontSize = 26.sp
            )

            Text(
                "NIM : 124140204",
                modifier = Modifier.padding(top = 16.dp),
                fontSize = 20.sp
            )

            Text(
                "Platform : Android",
                modifier = Modifier.padding(top = 10.dp),
                fontSize = 18.sp
            )
        }
    }
}