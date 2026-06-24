package com.example.composebasiclab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskCard(title: String, description: String, priority: String) {

    val borderColor = when (priority.lowercase()) {
        "high" -> Color.Red
        "medium" -> Color(0xFFFF9800)
        "low" -> Color.Green
        else -> Color.Gray
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {

        Row(modifier = Modifier.height(IntrinsicSize.Min)) {

            Box(
                modifier = Modifier
                    .width(8.dp)
                    .fillMaxHeight()
                    .background(borderColor)
            )


            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp)
            ) {
                Text(
                    text = title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = description,
                    fontSize = 14.sp,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(top = 4.dp)
                )
                Text(
                    text = "Priority: $priority",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    color = borderColor,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskCardPreview() {
    Column(modifier = Modifier.padding(8.dp)) {
        TaskCard(
            title = "Finish Mobile Lab 2",
            description = "Complete all Jetpack Compose UI tasks.",
            priority = "High"
        )
        TaskCard(
            title = "Buy Groceries",
            description = "Pick up milk, eggs, and bread from the store.",
            priority = "Medium"
        )
        TaskCard(
            title = "Read a Book",
            description = "Read one chapter of a sci-fi novel.",
            priority = "Low"
        )
    }
}
