package com.alkesh.sampleclassifiedsapp.presentation.screens.advertisement.viewModel

import androidx.lifecycle.MutableLiveData
import com.alkesh.sampleclassifiedsapp.common.base.viewModel.BaseViewModel
import com.alkesh.sampleclassifiedsapp.common.models.dto.AdvertisementModel


class AdvertisementDetailViewModel() : BaseViewModel() {
    val advertisementModel = MutableLiveData<AdvertisementModel>()
    val readDataFromBundle = MutableLiveData<Boolean>()

    init {
        readDataFromBundle.value = true
    }

    fun setAdvertisementDetailModel(model: AdvertisementModel) {
        advertisementModel.value = model
    }
}