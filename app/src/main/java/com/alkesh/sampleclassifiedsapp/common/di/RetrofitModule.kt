package com.alkesh.sampleclassifiedsapp.common.di

import com.alkesh.sampleclassifiedsapp.core.network.retrofitService.RetrofitService
import com.alkesh.sampleclassifiedsapp.core.network.services.AdvertisementService
import org.koin.dsl.module

val retrofitModule = module {

    single {
        RetrofitService(get(), get()).getInstance(AdvertisementService::class.java)
    }

}