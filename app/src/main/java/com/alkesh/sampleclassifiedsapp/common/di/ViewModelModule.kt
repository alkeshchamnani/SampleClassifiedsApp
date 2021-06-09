package com.alkesh.sampleclassifiedsapp.common.di

import com.alkesh.sampleclassifiedsapp.presentation.screens.advertisement.viewModel.AdvertisementDetailViewModel
import com.alkesh.sampleclassifiedsapp.presentation.screens.dashboard.viewModel.DashboardViewModel
import com.alkesh.sampleclassifiedsapp.presentation.screens.splash.viewModel.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel() {
        SplashViewModel()
    }
    viewModel() {
        DashboardViewModel(get())
    }
    viewModel() {
        AdvertisementDetailViewModel()
    }

}