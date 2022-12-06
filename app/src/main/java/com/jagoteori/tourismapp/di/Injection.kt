package com.jagoteori.tourismapp.di

import com.jagoteori.tourismapp.data.TourismRepository
import com.jagoteori.tourismapp.data.TourismRepositoryImpl

object Injection {
    fun provideRepository(): TourismRepository {
        return TourismRepositoryImpl.getInstance()
    }
}