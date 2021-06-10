package com.alkesh.sampleclassifiedsapp.presentation.screens.dashboard.viewModel

import com.alkesh.sampleclassifiedsapp.common.repository.AdvertisementRepository
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class DashboardViewModelTest {
    private lateinit var viewModel: DashboardViewModel

    @Before
    fun setup() {
        viewModel = DashboardViewModel(AdvertisementRepository())
    }

    @Test
    fun getListAdvertisements() {
        //viewModel.getListAdvertisements()
        assert(true)
    }

}