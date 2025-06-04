package com.example.jerry_store.ui.theme.screens.donut

import androidx.compose.runtime.Composable
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerry_store.R

@Composable

fun Badawy() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFED8DF))
    ) {
        Image(
            painter = painterResource(id = R.drawable.up),
            contentDescription = "Donut Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(170.dp)
                .height(170.dp)
                .align(Alignment.TopStart)
        )
        Image(
            painter = painterResource(id = R.drawable.pin),
            contentDescription = "Donut Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(170.dp)
                .height(170.dp)
                .align(Alignment.TopEnd)
        )

        Image(
            painter = painterResource(id = R.drawable.dodo),
            contentDescription = "Donut Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .align(Alignment.TopCenter)
                .offset(y=(40).dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 10.dp),
            verticalArrangement = Arrangement.Bottom,
        ) {
            Text(
                text = "Gonuts \nwith\nDonuts",
                fontSize = 54.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF7074),
                textAlign = TextAlign.Start,
                modifier=Modifier.offset(y=(-130).dp).offset(x=(10).dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets " +
                        "for specialize manufacturing of Donuts in Colombo,\n Sri Lanka.",
                fontSize = 18.sp,
                color = Color(0xFFFF9494),
                modifier = Modifier.padding(horizontal = 16.dp).offset(y=(-120).dp)
            )

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(348.dp)
                    .height(67.dp)
                    .offset(y=(-60).dp)
                    .offset(x=10.dp)
            ) {
                Text(
                    text = "Get Started", color = Color.Black, fontSize = 20.sp)
            }
        }
    }
}




@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "spec:width=428dp,height=926dp"
)
@Composable
fun JerryStorePreview() {
    Badawy()
}