package com.example.composebasiclab

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResourceUsageScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Loads a drawable from res/drawable. Replace with your actual drawable asset.
        Image(
            painter = painterResource(id = com.example.composebasiclab.R.drawable.suza),
            contentDescription = "Loaded Resource Graphic",
            modifier = Modifier.size(120.dp)
        )

        // Loads a string from res/values/strings.xml
        Text(
            text = stringResource(id = com.example.composebasiclab.R.string.welcome_title),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp)
        )

        Text(
            text = stringResource(id = com.example.composebasiclab.R.string.subtitle),
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ResourceUsagePreview() {
    ResourceUsageScreen()
}
