package com.jagoteori.tourismapp.ui.common

import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class BottomRoundedShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path().apply {
            lineTo(0f, size.height * 0.73f)
            quadraticBezierTo(
                size.width * 0.1f,
                size.height,
                size.width * 0.5f,
                size.height,
            )
            quadraticBezierTo(
                size.width * 0.9f,
                size.height,
                size.width,
                size.height * 0.73f
            )
            lineTo(size.width, 0f)
            close()
        }
        return Outline.Generic(path = path)
    }
}