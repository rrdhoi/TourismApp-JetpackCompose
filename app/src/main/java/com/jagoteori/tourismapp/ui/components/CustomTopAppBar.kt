package com.jagoteori.tourismapp.ui.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp

@Composable
fun CustomTopAppBar(
    title: String = "",
    backgroundColor: Color = MaterialTheme.colors.background,
    icon: ImageVector,
    iconDescription: String,
    elevation: Dp = AppBarDefaults.TopAppBarElevation,
    onIconClick: () -> Unit,
) {
    TopAppBar(
        backgroundColor = backgroundColor,
        elevation = elevation,
        navigationIcon = {
            IconButton(onClick = onIconClick) {
                Icon(
                    imageVector = icon,
                    contentDescription = iconDescription
                )
            }
        },
        title = { Text(text = title) }
    )
}
