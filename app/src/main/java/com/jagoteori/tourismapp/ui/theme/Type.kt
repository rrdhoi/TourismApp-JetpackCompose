package com.jagoteori.tourismapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jagoteori.tourismapp.R

val poppinsFamily = FontFamily(
    Font(R.font.poppins, FontWeight.Normal),
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
)
// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)