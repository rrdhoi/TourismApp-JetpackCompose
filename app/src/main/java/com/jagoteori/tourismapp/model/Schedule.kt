package com.jagoteori.tourismapp.model

data class Schedule(
    val id: Int,
    val day: String,
    val date: String,
    val isAvailable: Boolean,
    var isSelected: Boolean
)