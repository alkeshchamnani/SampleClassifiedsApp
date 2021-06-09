package com.alkesh.sampleclassifiedsapp.presentation.screens.splash.viewModel

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import com.alkesh.sampleclassifiedsapp.common.base.viewModel.BaseViewModel
import com.alkesh.sampleclassifiedsapp.presentation.screens.splash.constant.SplashConstant


class SplashViewModel() : BaseViewModel() {
    val navigateToDashboard = MutableLiveData<Boolean>()

    init {
        splashDelayed()
    }

    private fun splashDelayed() {
        Handler().postDelayed({
            navigateToDashboard.value = true
        }, SplashConstant.splashDuration)
    }

}