package com.jagoteori.tourismapp.data

import com.jagoteori.tourismapp.model.Tourism
import kotlinx.coroutines.flow.Flow

interface TourismRepository {
    fun getAllTourism(): Flow<List<Tourism>>
    fun getTourismById(id: Int): Tourism
    fun updateFavoriteTourism(id: Int): String
}