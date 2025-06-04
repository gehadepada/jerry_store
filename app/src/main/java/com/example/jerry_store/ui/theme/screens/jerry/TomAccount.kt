package com.example.jerry_store.ui.theme.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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
import com.example.jerry_store.ui.theme.white12

@Composable
fun TomAccount() {
    val SansArabic = FontFamily(
        Font(R.font.ibm_plex_sans_arabic_regular, FontWeight.Normal),
    )

    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF2e7299))
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(242.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.koty),
                        contentDescription = stringResource(id = R.string.top_bar_image_description),
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp))
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 32.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.tom_avatar),
                            contentDescription = "Tom Image",
                            modifier = Modifier
                                .width(64.dp)
                                .height(64.dp)

                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Tom",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontFamily = FontFamily(
                                Font(
                                    R.font.ibm_plex_sans_arabic_regular,
                                    FontWeight.Normal
                                )
                            )
                        )
                        Text(
                            text = "specializes in failure!",
                            fontSize = 12.sp,
                            color = Color.White,
                            fontFamily = FontFamily(
                                Font(
                                    R.font.ibm_plex_sans_arabic_regular,
                                    FontWeight.Normal
                                )
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Button(
                            modifier = Modifier
                                .height(25.dp)
                                .width(97.dp),
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = white12,
                                contentColor = Color.White,
                            ),
                            border = BorderStroke(0.dp, Color.Transparent),
                            contentPadding = PaddingValues(horizontal = 4.dp, vertical = 3.dp),

                            shape = RoundedCornerShape(15.dp),
                            elevation = null
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Edit foolishness", fontSize = 10.sp)
                            }
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxSize()
                        .offset(y = (-50).dp),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFEEF4F6)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            StatCard(
                                "2M 12K",
                                "No. of quarrels",
                                Color(0xFFD0E5F0),
                                R.drawable.ic_face
                            )
                            StatCard(
                                "+500 h",
                                "Chase time",
                                Color(0xFFC8E6C9),
                                R.drawable.ic_run
                            )
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            StatCard(
                                "2M 12K",
                                "Hunting times",
                                Color(0xFFF2D9E7),
                                R.drawable.ic_paw
                            )
                            StatCard(
                                "3M 7K",
                                "Heartbroken",
                                Color(0xFFFAEDCF),
                                R.drawable.ic_broken_heart
                            )
                        }
                    }

                    SectionHeader("Tom settings")
                    SettingItem("Change sleeping place", R.drawable.ic_bed)
                    SettingItem("Meow settings", R.drawable.cat)
                    SettingItem("Password to open the fridge", R.drawable.fridge)
                    Box(
                        modifier = Modifier
                            .padding(top= 7.dp ,bottom = 10.dp)
                    ) {
                        Divider(
                            color = Color(0xFFDBE3E5),
                            thickness = 1.dp
                        )
                    }
                    SectionHeader("His favorite foods")
                    SettingItem("Mouses", R.drawable.alert)
                    SettingItem("Last stolen meal", R.drawable.ic_food)
                    SettingItem("Change sleep mood", R.drawable.sleeping)

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        text = "v.TomBeta",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 50.dp).offset(y=(-5).dp),
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        color = Color.Gray,
                        fontFamily = SansArabic
                    )
                }
            }
        }
    }
}

@Composable
fun StatCard(value: String, label: String, backgroundColor: Color, iconId: Int) {
    val SansArabic = FontFamily(
        Font(R.font.ibm_plex_sans_arabic_regular, FontWeight.Normal),
    )

    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        modifier = Modifier
            .padding(4.dp)
            .width(160.dp)
            .height(58.dp)

    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp)
        )
        {
            Image(
                painter = painterResource(id = iconId),
                contentDescription = label,
                modifier = Modifier
                    .size(40.dp)
                    .offset(x = 4.dp, y = 7.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Column(
                modifier = Modifier.padding(9.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    color=Color(0xFF5E666B),
                    text = value, fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .offset(x = 3.dp),
                )
                Text(
                    text = label,
                    fontSize = 12.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .offset(x = 3.dp)
                )
            }
        }
    }
}

@Composable
fun SectionHeader(title: String) {
    val SansArabic = FontFamily(
        Font(R.font.bold, FontWeight.Normal),
    )

    Text(

        color=Color(0xFF3A3B3A),
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = SansArabic,
        modifier = Modifier.padding(horizontal = 16.dp)
    )
}

@Composable
fun SettingItem(title: String, iconId: Int) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .background(Color.White, shape = RoundedCornerShape(10.dp))

        ) {
            Image(
                painter = painterResource(id = iconId),
                contentDescription = title,
                modifier = Modifier.size(20.dp)

            )
        }
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = title, fontSize = 16.sp)
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "spec:width=360dp,height=827dp"
)
@Composable
fun previewTomAccount() {
    TomAccount()
}
