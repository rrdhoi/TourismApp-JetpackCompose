package com.jagoteori.tourismapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun RecommendationCard(modifier: Modifier, tourism: Tourism, onClickCard: () -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .height(90.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(color = WhiteColor)
            .clickable { onClickCard() }
    ) {
        Image(
            painter = painterResource(id = tourism.picture),
            contentDescription = tourism.name,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .padding(all = 10.dp)
                .size(70.dp)
                .clip(shape = RoundedCornerShape(18.dp))
        )
        Column(modifier = modifier.padding(horizontal = 16.dp)) {
            Text(
                text = tourism.name,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                fontFamily = poppinsFamily,
                color = BlackColor500
            )
            Spacer(modifier = modifier.height(5.dp))
            Text(
                text = tourism.name,
                fontWeight = FontWeight.Light,
                fontFamily = poppinsFamily,
                fontSize = 14.sp,
                color = GreyColor300
            )
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(end = 16.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_star),
                modifier = modifier.size(18.dp),
                contentDescription = ""
            )
            Spacer(modifier = modifier.width(6.dp))
            Text(
                text = tourism.rate,
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = BlackColor500
            )
        }
    }
}