package com.alkesh.sampleclassifiedsapp.presentation.screens.dashboard.listener

import com.alkesh.sampleclassifiedsapp.common.models.dto.AdvertisementModel


interface OnAdvertisementSelected {
    fun onClicked(model: AdvertisementModel)
}