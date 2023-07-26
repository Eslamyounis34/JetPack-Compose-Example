package com.example.composeexample

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample.ui.theme.ComposeExampleTheme
import com.example.composeexample.ui.theme.Purple40
import com.example.composeexample.ui.theme.Purple80


@Composable
fun GymScreen() {
    GymItem()
}

@Composable
fun GymItem() {

    Card(
        shape = RoundedCornerShape(6.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        modifier = Modifier.padding(10.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            GymIcon(Icons.Filled.Place, Modifier.weight(0.15f))
            GymDetails(Modifier.weight(0.85f))

        }
    }
}

@Preview(showBackground = true)
@Composable
fun _GymItemPreview() {
    ComposeExampleTheme {
        GymScreen()
    }
}

@Composable
fun GymDetails(modifier: Modifier) {

    Column(
        modifier = modifier
    ) {
        Text(text = "UpTown Gym", color = Purple40, style = MaterialTheme.typography.headlineSmall)
        Text(
            text = "20 El-Gehad, Mit Akaba ,Agouza , Giza Governorate , 3568925 ,Egypt",
            style = MaterialTheme.typography.bodyMedium
        )

    }

}

@Composable
fun GymIcon(place: ImageVector, modifier: Modifier) {
    Image(
        imageVector = place,
        modifier = modifier,
        contentDescription = "Gym Icon",
        colorFilter = ColorFilter.tint(
            Color.DarkGray
        )
    )

}
