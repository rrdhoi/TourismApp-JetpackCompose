package com.jagoteori.tourismapp.data

import com.jagoteori.tourismapp.model.FakeTourismDataSource
import com.jagoteori.tourismapp.model.Tourism
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class TourismRepositoryImpl : TourismRepository {
    private val _tourismList = mutableListOf<Tourism>()
    private val tourismList: List<Tourism> get() = _tourismList

    init {
        if (_tourismList.isEmpty()) {
            FakeTourismDataSource.dummyTourism.forEach {
                _tourismList.add(it)
            }
        }
    }

    override fun getAllTourism(): Flow<List<Tourism>> = flowOf(tourismList)

    override fun getTourismById(id: Int): Tourism = tourismList.first { it.id == id }

    override fun updateFavoriteTourism(id: Int): String {
        return try {
            val index = tourismList.indexOfFirst { it.id == id }
            if (tourismList[index].isFavorite) {
                _tourismList[index] = tourismList[index].copy(isFavorite = false)
                "Berhasil dihapus dari favorit"
            } else {
                _tourismList[index] = tourismList[index].copy(isFavorite = true)
                "Berhasil ditambahkan ke favorit"
            }
        } catch (e: Exception) {
            "Gagal menambahkan ke favorit"
        }
    }


    companion object {
        @Volatile
        private var instance: TourismRepositoryImpl? = null

        fun getInstance(): TourismRepositoryImpl =
            instance ?: synchronized(this) {
                TourismRepositoryImpl().apply {
                    instance = this
                }
            }
    }
}