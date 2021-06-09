package com.alkesh.sampleclassifiedsapp.presentation.screens.splash.activity

import android.content.Intent
import android.os.Handler
import com.alkesh.sampleclassifiedsapp.R
import com.alkesh.sampleclassifiedsapp.common.base.activity.AppBaseActivity
import com.alkesh.sampleclassifiedsapp.presentation.screens.dashboard.activity.DashboardActivity
import com.alkesh.sampleclassifiedsapp.presentation.screens.splash.constant.SplashConstant
import com.alkesh.sampleclassifiedsapp.presentation.screens.splash.viewModel.SplashViewModel
import org.koin.android.viewmodel.ext.android.getViewModel

class SplashActivity : AppBaseActivity() {
    private lateinit var viewModel: SplashViewModel
    override fun init() {
        viewModel = getViewModel<SplashViewModel>()

        val handler = Handler()
        val runnable = Runnable {
            finish()
            startAnotherActivity(Intent(this, DashboardActivity::class.java))
        }
        handler.postDelayed(runnable, SplashConstant.splashDuration)
    }

    override fun setEvents() {
    }

    override fun setObservers() {
    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_splash
    }
}