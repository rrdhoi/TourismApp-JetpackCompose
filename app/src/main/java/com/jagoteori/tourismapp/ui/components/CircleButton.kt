package com.jagoteori.tourismapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.jagoteori.tourismapp.R
import com.jagoteori.tourismapp.ui.extension.noRippleClickable
import com.jagoteori.tourismapp.ui.theme.GreyColor100

@Composable
fun CircleButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    icon: Int,
    iconDescription: Int
) {
    Surface(
        shape = CircleShape,
        color = GreyColor100,
        modifier = Modifier
            .size(42.dp)
            .noRippleClickable { onClick() },
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = stringResource(id = iconDescription),
            modifier = modifier.padding(all = 10.dp)
        )
    }
}