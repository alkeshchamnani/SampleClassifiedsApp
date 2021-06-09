package com.alkesh.sampleclassifiedsapp.common.di

import com.alkesh.sampleclassifiedsapp.common.repository.AdvertisementRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        AdvertisementRepository(get())
    }
}