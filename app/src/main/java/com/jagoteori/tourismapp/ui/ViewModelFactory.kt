package com.jagoteori.tourismapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jagoteori.tourismapp.data.TourismRepository
import com.jagoteori.tourismapp.ui.screen.detail.DetailViewModel
import com.jagoteori.tourismapp.ui.screen.home.HomeViewModel

class ViewModelFactory(private val repository: TourismRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(repository) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}