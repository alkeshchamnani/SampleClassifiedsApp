package com.alkesh.sampleclassifiedsapp.common.di

import com.alkesh.sampleclassifiedsapp.common.util.ImageUtil
import org.koin.dsl.module

val utilsModule = module {
    single {
        ImageUtil()
    }
}