package com.alkesh.sampleclassifiedsapp.common.base.application

import android.app.Application
import android.widget.Toast
import com.alkesh.sampleclassifiedsapp.common.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApplication)
            modules(
                    listOf(
                            appModule,
                            retrofitModule,
                            repositoryModule,
                            viewModelModule,
                            utilsModule
                    )
            )
        }
    }
}