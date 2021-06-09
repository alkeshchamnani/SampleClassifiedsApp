package com.alkesh.sampleclassifiedsapp.presentation.screens.splash.activity

import android.content.Intent
import androidx.lifecycle.Observer
import com.alkesh.sampleclassifiedsapp.R
import com.alkesh.sampleclassifiedsapp.common.base.activity.AppBaseActivity
import com.alkesh.sampleclassifiedsapp.presentation.screens.dashboard.activity.DashboardActivity
import com.alkesh.sampleclassifiedsapp.presentation.screens.splash.viewModel.SplashViewModel
import org.koin.android.viewmodel.ext.android.getViewModel

class SplashActivity : AppBaseActivity() {
    private lateinit var viewModel: SplashViewModel
    override fun init() {
        viewModel = getViewModel()
    }

    override fun setEvents() {
    }

    override fun setObservers() {
        viewModel.navigateToDashboard.observe(this, Observer {
            if (it) {
                finish()
                startAnotherActivity(Intent(this, DashboardActivity::class.java))
            }
        })
    }

    override fun getLayoutResId() = R.layout.activity_splash
}