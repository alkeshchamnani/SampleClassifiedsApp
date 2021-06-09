package com.alkesh.sampleclassifiedsapp.presentation.screens.dashboard.viewModel

import androidx.lifecycle.MutableLiveData
import com.alkesh.sampleclassifiedsapp.common.base.viewModel.BaseViewModel
import com.alkesh.sampleclassifiedsapp.common.models.dto.AdvertisementModel
import com.alkesh.sampleclassifiedsapp.common.repository.AdvertisementRepository
import kotlinx.coroutines.launch


class DashboardViewModel(private val advertisementRepository: AdvertisementRepository) :
    BaseViewModel() {
    val listAdvertisements = MutableLiveData<ArrayList<AdvertisementModel>>()

    fun getListAdvertisements() {
        isLoading.value = true
        showMessage.value = null
        coroutineScope.launch {
            val result = advertisementRepository.getAdvertisements()
            isLoading.value = false
            result?.let {
                if (it.successful) {
                    listAdvertisements.value = result.result
                } else {
                    showMessage.value = result.message
                }
            }
        }
    }
}