package com.alkesh.sampleclassifiedsapp.core.network.services

import com.alkesh.sampleclassifiedsapp.common.models.response.GetAdvertisementApiResponse
import retrofit2.Response
import retrofit2.http.GET


interface AdvertisementService {
    @GET("default/dynamodb-writer")
    suspend fun getAdvertisements(): Response<GetAdvertisementApiResponse>

}