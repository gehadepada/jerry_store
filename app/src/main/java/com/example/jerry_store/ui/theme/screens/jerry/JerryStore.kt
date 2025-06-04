package com.example.jerry_store.ui.theme.screens

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
import androidx.compose.runtime.Composable
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
fun JerryStore() {
    val SansArabic = FontFamily(
        Font(R.font.ibm_plex_sans_arabic_regular, FontWeight.Normal),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFEEF4F6))
            .padding(top = 40.dp)
            .padding(horizontal = 16.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.top_bar),
                    contentDescription = stringResource(id = R.string.top_bar_image_description),
                    modifier = Modifier.clip(RoundedCornerShape(12.dp))
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                    fontSize = 14.sp,
                    color = Color(0xFF1F1F1E),
                    fontFamily = SansArabic,
                )
                Text(
                    text = "Which Tom do you want to buy?",
                    fontSize = 12.sp,
                    color = Color(0xFFA5A6A4),
                    fontFamily = SansArabic,
                )
            }
            BadgedBox(
                badge = {
                    Badge(
                        containerColor = Color(0xFF03578A),
                        contentColor = Color.White,
                        modifier = Modifier
                            .size(14.dp)
                            .offset(x = 15.dp, y = (-3).dp)
                    ) {
                        Text("3", fontSize = 9.sp)
                    }
                },
                modifier = Modifier.size(36.dp),
                content = {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(40.dp)
                            .border(1.dp, Color(0x1F1F1E26), RoundedCornerShape(12.dp))
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.notification),
                            contentDescription = "notification",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(12.dp))
            ) {
                Text(
                    text = "Search about tom ...",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .offset(x=43.dp ,y =16.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.search_normal),
                    contentDescription = "search",
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                        .offset(x=9.dp)
                        .align(Alignment.CenterStart),
                    tint = Color(0xFF969799)
                )
            }

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF03578A)),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.size(48.dp),
                contentPadding = PaddingValues(0.dp)

            ) {
                Icon(
                    painter = painterResource(id = R.drawable.elements),
                    contentDescription = "Filter",
                    modifier = Modifier.size(23.dp),
                    tint = Color.White
                )
            }
        }

        Box(
            modifier = Modifier
                .width(328.dp)
                .height(120.dp)
                .padding(top = 16.dp)
        ) {

            Box(
                modifier = Modifier
                    .height(92.dp)
                    .width(328.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xFF03446A), Color(0xFF0685D0))
                        )
                    )
                    .align(Alignment.BottomCenter)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(
                        text = "Buy 1 Tom and get 2 for free",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = SansArabic,
                    )
                    Text(
                        text = "Adopt Tom! (Free Fail-Free \nGuarantee)",
                        color = Color.White.copy(alpha = 0.9f),
                        fontSize = 12.sp,
                        fontFamily = SansArabic,
                    )
                }
            }

            Box(
                modifier = Modifier
                    .width(328.dp)
                    .height(130.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.circuke),
                    contentDescription = "Background circles",
                    modifier = Modifier
                        .size(130.dp)
                        .align(Alignment.CenterEnd)
                        .offset(x = 20.dp),
                    contentScale = ContentScale.Fit
                )

                Image(
                    painter = painterResource(id = R.drawable.tom),
                    contentDescription = "Tom character",
                    modifier = Modifier
                        .width(115.38.dp)
                        .align(Alignment.BottomEnd)
                        .offset(x = 1.dp, y = (-2).dp).fillMaxHeight(),

                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
                .height(28.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Cheap tom section",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "View all",
                    fontSize = 12.sp,
                    color = Color(0xFF03578A)
                )
                Icon(
                    painter = painterResource(id = R.drawable.elements__1_),
                    contentDescription = "Arrow",
                    modifier = Modifier
                        .size(12.dp)
                        .padding(start = 4.dp),
                    tint = Color(0xFF03578A)
                )
            }
        }

        TomCharacterGrid()
    }
}

@Composable
fun TomCharacterGrid() {
    val characters = listOf(
        TomCharacter(
            name = "Sport Tom",
            description = "He runs 1 meter... trips over his boot.",
            cheeses = 3,
            imageRes = R.drawable.c4b3da03927a5776e0dfbf12206a18341c41bc06
        ),
        TomCharacter(
            name = "Tom the lover",
            description = "He loves one-sidedly... and is beaten to the other side.",
            cheeses = 5,
            imageRes = R.drawable.tom_lover
        ),
        TomCharacter(
            name = "Tom the bomb",
            description = "He blows himself up before Jerry can catch him.",
            cheeses = 10,
            imageRes = R.drawable.tom_bomb
        ),
        TomCharacter(
            name = "Spy Tom",
            description = "Disguises itself as a table.",
            cheeses = 12,
            imageRes = R.drawable.spy_tom
        ),
        TomCharacter(
            name = "Frozen Tom",
            description = "He was chasing Jerry, he froze after the first look.",
            cheeses = 10,
            imageRes = R.drawable.frozen_tom
        ),
        TomCharacter(
            name = "Sleeping Tom",
            description = "He doesn't chase anyone. He just snores in stress.",
            cheeses = 2,
            imageRes = R.drawable.sleeping_tom
        )
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(top = 18.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(19.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(characters) { character ->
            TomCharacterCard(character = character)
        }
    }
}

@Composable
fun TomCharacterCard(character: TomCharacter) {
    val SansArabic = FontFamily(
        Font(R.font.ibm_plex_sans_arabic_regular, FontWeight.Normal)
    )

    Box(
        modifier = Modifier
            .width(160.dp)
            .height(230.dp),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .width(160.dp)
                .height(219.dp)
                .align(Alignment.BottomCenter),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(12.dp)
        ) {}

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = character.imageRes),
                contentDescription = character.name,
                modifier = Modifier
                    .width(98.dp)
                    .height(100.dp)
                    .offset(y = (-15).dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = character.name,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontFamily = SansArabic,
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = character.description,
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                fontFamily = SansArabic,
                fontSize = 12.sp,
                lineHeight = 12.sp,
                modifier = Modifier.padding(horizontal = 4.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            Color(0xFFE0F0FA),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier=Modifier.width(85.dp).height(18.dp).padding(start=1.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.money),
                            contentDescription = "Cheese",
                            modifier = Modifier.size(16.dp),
                            tint = Color(0xFF03578A),
                        )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(
                            text = "${character.cheeses} cheeses",
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFF03578A),
                            fontFamily = SansArabic,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp
                        )
                    }
                }

                Icon(
                    painter = painterResource(id = R.drawable.add),
                    contentDescription = "Buy",
                    modifier = Modifier.size(30.dp),
                    tint = Color(0xFF03578A)
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "spec:width=360dp,height=1085dp"
)
@Composable
fun JerryStorePreview() {
    JerryStore()
}