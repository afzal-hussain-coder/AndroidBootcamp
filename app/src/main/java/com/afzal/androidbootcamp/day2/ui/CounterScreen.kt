package com.afzal.androidbootcamp.day2.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush.Companion.horizontalGradient
import androidx.compose.ui.graphics.Brush.Companion.verticalGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.afzal.androidbootcamp.day2.viewmodel.CounterViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterScreen(viewModel: CounterViewModel = viewModel()) {

    // Collect the current count from the ViewModel as a State
    val count by viewModel.count.collectAsState()

    // Box with gradient background
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(20.dp))
            .background(
                brush = verticalGradient(
                    colors = listOf(
                        Color(0xFFffffcc),
                        Color(0xFF99ccff)
                    )
                )
            )
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .padding(20.dp)
                .align(Alignment.Center)
                .clip(RoundedCornerShape(20.dp)),
            elevation = CardDefaults.cardElevation(30.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(
                        brush = verticalGradient(
                            colors = listOf(
                                Color(0xFF99ccff),
                                Color(0xFFffffcc)

                            )
                        )
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "The count is : $count",
                        fontSize = 22.sp,
                        color = Color(0xFFffffcc)
                    )
                    Spacer(modifier = Modifier.height(36.dp))
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            Color(0xFFffffcc),
                            contentColor = Color(0xFF99ccff)
                        ), onClick = {
                            // Increment the count when the button is clicked
                            viewModel.incrementCount()
                        }) {
                        Text(text = "Increment")
                    }
                    Spacer(modifier = Modifier.height(36.dp))
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            Color(0xFF99ccff),
                            contentColor = Color(0xFFffffcc)
                        ),
                        onClick = {
                            // Decrement the count when the button is clicked
                            viewModel.decrementCount()
                        }) {
                        Text(text = "Decrement")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterScreenPreview() {
    CounterScreen()
}

