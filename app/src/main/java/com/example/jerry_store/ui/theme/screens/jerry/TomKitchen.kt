package com.example.jerry_store.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerry_store.R

@Composable
fun TomKitchen() {
    val SansArabic = FontFamily(
        Font(R.font.ibm_plex_sans_arabic_regular, FontWeight.Normal),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFEEF4F6))
            .padding(top = 35.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0x80548480))
                )
                Image(
                    painter = painterResource(id = R.drawable.eli),
                    contentDescription = "Circle Image",
                    modifier = Modifier
                        .width(280.dp)
                        .height(280.dp)
                        .align(Alignment.TopStart)
                        .offset(x = (-100).dp),

                    contentScale = ContentScale.Crop
                )

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 20.dp)
                        .offset(y = (-10).dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon2),
                            contentDescription = "High tension",
                            tint = Color.White,
                            modifier = Modifier.size(21.5.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "High tension",
                            fontSize = 16.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Medium,
                            fontFamily = SansArabic,
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon3),
                            contentDescription = "Shocking foods",
                            tint = Color.White,
                            modifier = Modifier
                                .width(19.5.dp)
                                .height(21.5.dp)

                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Shocking foods",
                            fontSize = 16.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Medium,
                            fontFamily = SansArabic,
                        )
                    }
                }
            }


        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .offset(y = (-20).dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )

            ) {
                Column(
                    modifier = Modifier
                        .background(color = Color(0xFFF2F8FA))
                        .fillMaxSize()
                        .padding(
                            top = 30.dp,
                            start = 20.dp,
                            end = 20.dp,
                            bottom = 20.dp
                        )
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Electric Tom pasta",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontFamily = SansArabic,
                        )
                        Box(
                            modifier = Modifier
                                .width(24.dp)
                                .height(24.dp)
                        ) {

                            Icon(
                                painter = painterResource(id = R.drawable.fav),
                                contentDescription = "fav",
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                                    .offset(y = (10).dp),
                                tint = Color(0xFF03578A),

                                )
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .background(
                                color = Color(0xFFE3F2FD),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.money),
                            contentDescription = "Cheese",
                            tint = Color(0xFF03578A),
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "5 cheeses",
                            fontSize = 13.sp,
                            color = Color(0xFF03578A),
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Spacer(modifier = Modifier.height(13.dp))
                    Text(
                        text = "Pasta cooked with a charger cable and \nsprinkled with questionable cheese." +
                                " Make sure \nto unplug it before eating (or not, you decide).",
                        fontSize = 14.sp,
                        color = Color(0xFF6A6C6D),
                        // lineHeight = 24.sp,
                        modifier = Modifier
                            .offset(y = (-5).dp),
                        fontFamily = SansArabic,

                        )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .offset(y = 16.dp)

                    ) {
                        Text(
                            text = "Details",
                            fontSize = 18.sp,
                        )
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(y = (-30).dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        DetailCard("1000 V", "Temperature", R.drawable.icon)
                        DetailCard("3 sparks", "Time", R.drawable.icon1)
                        DetailCard("1M 12K", "No. of deaths", R.drawable.evil)
                    }

                    Text(
                        text = "Preparation method",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3A3B3A)
                    )
                    Spacer(modifier = Modifier.height(12.dp))

                    val steps = listOf(
                        "Put the pasta in a toaster.",
                        "Pour battery juice over it.",
                        "Wait for the spark to ignite.",
                        "Serve with an insulating glove."
                    )


                    steps.forEachIndexed { index, step ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(38.dp)
                                    .background(
                                        color = Color.White,
                                        shape = RoundedCornerShape(15.dp)
                                    )
                                    .offset(y = 2.dp)

                            ) {
                                Text(
                                    text = step,
                                    fontSize = 14.sp,
                                    color = Color(0xFF717171)

                                )
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .size(41.dp)
                                        .offset(x = (-10).dp)
                                        .background(Color.White, shape = CircleShape)
                                        .align(Alignment.TopStart)
                                        .border(1.dp, Color(0xFFD0E5F0), shape = CircleShape)


                                ) {
                                    Text(
                                        text = "${index + 1}",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 12.sp,
                                        color = Color(0xFF035587),
                                        modifier = Modifier
                                            .align(Alignment.Center)

                                    )
                                }
                            }
                        }
                    }

                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(86.dp)
                    .background(color = Color(0xFFFFFFFF))
                    .align(Alignment.BottomCenter)
                    .border(1.dp, color = Color(0xFFA0A3A5))

            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF226993)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .align(Alignment.BottomCenter)
                        .padding(start = 16.dp, end = 16.dp)
                        .offset(y = (-19).dp)
                ) {
                    Row(
                        modifier=Modifier
                            .offset(y=7.dp)
                    ) {
                        Text(
                            text = "Add to cart  ",
                            fontSize = 16.sp,
                            color = Color(0xFFE2EBF1)
                        )
                        Text(
                            text = "•",fontSize=20.sp,color=Color(0xFF76A2BC)

                        )
                        Column(
                            modifier=Modifier
                                .offset(y=(-10).dp)
                                .offset(x=6.dp)
                        )
                        {
                            Text(
                                text = "3 cheeses" ,fontSize=12.sp
                            )
                            Text(
                                modifier=Modifier.offset(x = 4.dp),
                                text = ("5 cheeses"),
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    textDecoration = TextDecoration.LineThrough,
                                    fontSize=11.sp,

                                )
                            )
                        }
                    }
                }
            }
            Box(
                modifier = Modifier
                    .width(187.61.dp)
                    .height(168.dp)
                    .align(Alignment.TopEnd)
                    .padding(end = 20.dp)
                    .padding(bottom = 20.dp)
                    .offset(x = (-8).dp, y = (-145).dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mm),
                    contentDescription = "Circle Image",
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.TopStart),

                    )
            }

        }
    }
}


@Composable
fun DetailCard(value: String, label: String, idd: Int) {
    Column(
        modifier = Modifier
            .width(101.dp)
            .height(101.dp)
            .background(Color(0xFFD0E5F0), RoundedCornerShape(12.dp))
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = idd),
            contentDescription = "ayhaga",
            modifier = Modifier
                .width(22.dp)
                .height(22.dp)

        )
        Spacer(modifier = Modifier.height(7.dp))
        Text(
            text = value,
            fontSize = 14.sp,
            color = Color(0xFF5E666B),
            modifier = Modifier
                .offset(y = (4.dp))
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = label,
            fontSize = 12.sp,
            color = Color(0xFF8A979E),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .offset(y = (3.dp))
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "spec:width=360dp,height=862dp"
)

@Composable
fun PreviewTomKitchen() {
    TomKitchen()
}
