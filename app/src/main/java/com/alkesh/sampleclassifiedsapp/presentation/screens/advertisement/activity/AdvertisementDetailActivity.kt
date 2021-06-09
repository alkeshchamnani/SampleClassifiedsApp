package com.alkesh.sampleclassifiedsapp.presentation.screens.advertisement.activity

import androidx.lifecycle.Observer
import com.alkesh.sampleclassifiedsapp.R
import com.alkesh.sampleclassifiedsapp.common.base.activity.AppBaseActivity
import com.alkesh.sampleclassifiedsapp.common.models.dto.AdvertisementModel
import com.alkesh.sampleclassifiedsapp.common.util.ImageUtil
import com.alkesh.sampleclassifiedsapp.presentation.screens.advertisement.constant.AdvertisementDetailConstant
import com.alkesh.sampleclassifiedsapp.presentation.screens.advertisement.viewModel.AdvertisementDetailViewModel
import kotlinx.android.synthetic.main.activity_advertisement_detail.*
import kotlinx.android.synthetic.main.layout_toolbar.*
import org.koin.android.viewmodel.ext.android.getViewModel

class AdvertisementDetailActivity : AppBaseActivity() {
    private lateinit var viewModel: AdvertisementDetailViewModel
    override fun init() {
        toolbar.setup(this, getString(R.string.activity_advertisement_detail_title), true)
        viewModel = getViewModel<AdvertisementDetailViewModel>()
        val model = readDataFromBundle()
        model?.let {
            populateAdvertisementModel(it)
        }
    }

    override fun setEvents() {

    }

    override fun setObservers() {
        viewModel.showMessage.observe(this, Observer {
            it?.let {
                showMessage(it)
            }
        })
        viewModel.isLoading.observe(this, Observer {

        })
    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_advertisement_detail
    }

    private fun populateAdvertisementModel(model: AdvertisementModel) {
        model.imageUrls?.let {
            val list = it
            if (list.size > 0) {
                val image = list[0]
                ImageUtil.loadImage(ivBanner.context, ivBanner, image)

            }
        }
        model.uid?.let {
            tvID.text = it
        }
        model.name?.let {
            tvName.text = it
        }
        model.date?.let {
            tvDate.text = it
        }
        model.price?.let {
            tvPrice.text = it
        }


    }

    private fun readDataFromBundle(): AdvertisementModel? {
        var model: AdvertisementModel? = null
        val ob = intent.getSerializableExtra(AdvertisementDetailConstant.Bundle_Advertisement_Model)
        if (ob is AdvertisementModel) {
            model = ob
        }
        return model
    }
}