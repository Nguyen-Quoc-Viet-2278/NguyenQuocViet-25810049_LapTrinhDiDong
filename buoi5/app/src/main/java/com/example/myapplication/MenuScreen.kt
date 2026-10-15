package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuScreen(onNavigate: (String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Buổi 5", fontSize = 32.sp)
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = { onNavigate("birthday") },
            modifier = Modifier.width(200.dp)
        ) {
            Text("Happy Birthday")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { onNavigate("dice") },
            modifier = Modifier.width(200.dp)
        ) {
            Text("Dice Roller")
        }
    }
}