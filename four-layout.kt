package com.example.composebasiclab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FourQuadrantLayout() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Top Row
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                title = "First Quadrant",
                paragraph = "This is the top-left section of the screen layout.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = "Second Quadrant",
                paragraph = "This is the top-right section of the screen layout.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        // Bottom Row
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                title = "Third Quadrant",
                paragraph = "This is the bottom-left section of the screen layout.",
                backgroundColor = Color(0xFFBDB2FF),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = "Fourth Quadrant",
                paragraph = "This is the bottom-right section of the screen layout.",
                backgroundColor = Color(0xFFFFC6FF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Quadrant(
    title: String,
    paragraph: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = paragraph,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FourQuadrantLayoutPreview() {
    FourQuadrantLayout()
}
