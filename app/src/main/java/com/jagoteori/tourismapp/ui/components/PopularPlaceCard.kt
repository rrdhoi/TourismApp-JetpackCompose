package com.jagoteori.tourismapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jagoteori.tourismapp.R
import com.jagoteori.tourismapp.model.Tourism
import com.jagoteori.tourismapp.ui.theme.BlackColor500
import com.jagoteori.tourismapp.ui.theme.GreyColor300
import com.jagoteori.tourismapp.ui.theme.WhiteColor
import com.jagoteori.tourismapp.ui.theme.poppinsFamily

@Composable
fun PopularPlaceCard(tourism: Tourism, modifier: Modifier = Modifier, onClickCard: () -> Unit) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(18.dp))
            .background(WhiteColor)
            .clickable { onClickCard() }) {
        Box(contentAlignment = Alignment.TopEnd, modifier = modifier.padding(10.dp)) {
            Image(
                painter = painterResource(id = tourism.picture),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(220.dp)
                    .width(180.dp)
                    .clip(RoundedCornerShape(18.dp))
            )
            Card(
                shape = RoundedCornerShape(bottomStart = 18.dp),
                elevation = 0.dp
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = modifier
                        .background(color = WhiteColor)
                        .height(30.dp)
                        .padding(bottom = 4.dp, end = 2.dp, start = 5.5.dp)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.icon_star),
                        modifier = modifier.size(16.dp),
                        contentDescription = ""
                    )
                    Spacer(modifier = modifier.width(4.dp))
                    Text(
                        text = tourism.rate,
                        fontSize = 14.sp,
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
        Column(modifier = modifier.padding(start = 20.dp, end = 20.dp, bottom = 20.dp)) {
            Text(
                text = tourism.name,
                fontFamily = poppinsFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = BlackColor500
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = tourism.location,
                fontFamily = poppinsFamily,
                fontSize = 14.sp,
                fontWeight = FontWeight.Light,
                color = GreyColor300
            )
        }
    }
}