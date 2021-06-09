package com.alkesh.sampleclassifiedsapp.common.di

import com.alkesh.sampleclassifiedsapp.common.constant.AppConstants
import org.koin.dsl.module

val appModule = module {

    single {
        AppConstants()
    }

}