package com.afzal.androidbootcamp.day1.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush.Companion.verticalGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ProfileCardScreen() {

    var profession by remember { mutableStateOf("Android Developer") }
    // Box with gradient background
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(10.dp))
            .background(
                brush = verticalGradient(
                    colors = listOf(
                        Color(0xFFf0f2f5),
                        Color(0xFF424d63)
                    )
                )
            ),
        contentAlignment = Alignment.Center,
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(15.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        brush = verticalGradient(
                            colors = listOf(
                                Color(0xFF424d63),
                                Color(0xFFf0f2f5)
                            )
                        )
                    )
            ) {


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Afzal Hussain", fontSize = 28.sp, fontWeight = FontWeight.Bold,
                        color = Color(0xFFf0f2f5)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = profession, fontSize = 18.sp, color = Color(0xFF424d63),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        profession = "Modern Android Developer"
                    }, colors = ButtonDefaults.buttonColors(Color(0xFFf0f2f5))) {
                        Text(text = "Change Profession", color = Color(0xFF424d63))
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        profession = "Er.Afzal Hussain Android Developer"
                    }, colors = ButtonDefaults.buttonColors(Color(0xFF424d63))) {
                        Text(text = "Change Profession Again", color = Color(0xFFf0f2f5))
                    }

                }
            }

        }
    }
}
