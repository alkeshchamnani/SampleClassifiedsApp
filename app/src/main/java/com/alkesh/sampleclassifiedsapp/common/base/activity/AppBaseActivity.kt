package com.alkesh.sampleclassifiedsapp.common.base.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


abstract class AppBaseActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)

        init()
        setEvents()
        setObservers()
    }


    protected abstract fun init()
    protected abstract fun setEvents()
    protected abstract fun setObservers()
    protected abstract fun getLayoutResId(): Int
}