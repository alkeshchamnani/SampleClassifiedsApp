package com.alkesh.sampleclassifiedsapp.common.repository

import com.alkesh.sampleclassifiedsapp.common.base.repository.BaseRepository
import com.alkesh.sampleclassifiedsapp.common.models.response.GetAdvertisementApiResponse
import com.alkesh.sampleclassifiedsapp.core.network.services.AdvertisementService


class AdvertisementRepository(
    private val advertisementService: AdvertisementService
) : BaseRepository() {

    suspend fun getAdvertisements(): GetAdvertisementApiResponse? {
        var model: GetAdvertisementApiResponse? = null
        try {
            val response = advertisementService.getAdvertisements()
            if (response.isSuccessful) {
                model = response.body()
            }
        } catch (exp: Exception) {
        }
        return model
    }

}