package com.example.myapplication.game

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

val GreenPrimary = Color(0xFF2E7D32)
val GreenBackground = Color(0xFFE8F5E9)

@Composable
fun GameScreen(
    gameViewModel: GameViewModel = viewModel()
) {
    val gameUiState by gameViewModel.uiState.collectAsStateWithLifecycle()

    if (gameUiState.isGameOver) {
        GameOverDialog(
            score = gameUiState.score,
            onPlayAgain = { gameViewModel.resetGame() }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GreenBackground)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "🟢 Unscramble",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = GreenPrimary
        )

        Spacer(modifier = Modifier.height(24.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Từ ${gameUiState.currentWordCount}/10",
                    color = GreenPrimary,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = gameUiState.currentScrambledWord.uppercase(),
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1B5E20),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Hãy đoán từ bị xáo trộn trên!",
                    fontSize = 13.sp,
                    color = Color.Gray
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = gameViewModel.userGuess,
            onValueChange = { gameViewModel.updateUserGuess(it) },
            label = { Text("Nhập từ của bạn") },
            isError = gameUiState.isGuessedWordWrong,
            supportingText = {
                if (gameUiState.isGuessedWordWrong) {
                    Text("Sai rồi! Thử lại nhé", color = Color.Red)
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = GreenPrimary,
                focusedLabelColor = GreenPrimary
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Điểm: ${gameUiState.score}",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = GreenPrimary
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            OutlinedButton(
                onClick = { gameViewModel.skipWord() },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = GreenPrimary
                )
            ) {
                Text("Bỏ qua")
            }

            Button(
                onClick = { gameViewModel.checkUserGuess() },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = GreenPrimary
                )
            ) {
                Text("Xác nhận")
            }
        }
    }
}

@Composable
fun GameOverDialog(
    score: Int,
    onPlayAgain: () -> Unit
) {
    AlertDialog(
        onDismissRequest = {},
        title = { Text("🎉 Game Over!", color = GreenPrimary) },
        text = { Text("Điểm của bạn: $score") },
        confirmButton = {
            Button(
                onClick = onPlayAgain,
                colors = ButtonDefaults.buttonColors(containerColor = GreenPrimary)
            ) {
                Text("Chơi lại")
            }
        }
    )
}