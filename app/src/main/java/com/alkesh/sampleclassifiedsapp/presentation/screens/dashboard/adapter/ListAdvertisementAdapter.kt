package com.alkesh.sampleclassifiedsapp.presentation.screens.dashboard.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alkesh.sampleclassifiedsapp.R
import com.alkesh.sampleclassifiedsapp.common.models.dto.AdvertisementModel
import com.alkesh.sampleclassifiedsapp.common.util.ImageUtil
import com.alkesh.sampleclassifiedsapp.presentation.screens.dashboard.listener.OnAdvertisementSelected
import kotlinx.android.synthetic.main.cell_list_advertisment.view.*


class ListAdvertisementAdapter(
    private val context: Context,
    private val list: ArrayList<AdvertisementModel>,
    private val onAdvertisementSelected: OnAdvertisementSelected
) : RecyclerView.Adapter<ListAdvertisementAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cell_list_advertisment, parent, false)
        return ViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = list.get(position)

        model.name?.let {
            holder.tvTitle.text = it
        }
        model.price?.let {
            holder.tvPrice.text = it
        }
        model.imageUrlsThumbnails?.let {
            if (it.size > 0) {
                val image = it[0]
                ImageUtil.loadImage(holder.ivThumbnail.context, holder.ivThumbnail, image)
            }
        }

        holder.itemView.setOnClickListener(View.OnClickListener {
            onAdvertisementSelected.onClicked(model)
        })
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.tvName
        val tvPrice: TextView = view.tvPrice
        val ivThumbnail: ImageView = view.ivThumbnail


    }
}