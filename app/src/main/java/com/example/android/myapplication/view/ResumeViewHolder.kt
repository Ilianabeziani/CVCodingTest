package com.example.android.myapplication.view

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.bumptech.glide.Glide
import com.example.android.myapplication.R
import com.example.android.myapplication.model.PastExperience

class ResumeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val companyLogo: ImageView
    private val companyName: TextView
    private val roleName: TextView
    private val dateFrom: TextView
    private val dateTo: TextView
    private val mainResponsibilities: TextView
    private val achievements: TextView


    private val context: Context

    init {
        context = itemView.context
        companyLogo = itemView.findViewById(R.id.album_image)
        companyName = itemView.findViewById(R.id.companyName)
        roleName = itemView.findViewById(R.id.roleName)
        dateFrom = itemView.findViewById(R.id.dateFrom)
        dateTo = itemView.findViewById(R.id.dateTo)
        mainResponsibilities = itemView.findViewById(R.id.responsibilities)
        achievements = itemView.findViewById(R.id.achievements)
    }


    fun bind(pastExperience: PastExperience) {
        val imageUrl = pastExperience.companyLogo
        setAlbumImage(companyLogo, imageUrl, context)
        companyName.text = pastExperience.companyName
        roleName.text = pastExperience.roleName
        dateFrom.text = pastExperience.dateFrom
        dateTo.text = pastExperience.dateTo
        mainResponsibilities.text = pastExperience.mainResponsibility
        achievements.text = pastExperience.achievements!!.toString()

    }

    private fun setAlbumImage(companyLogo: ImageView, imageUrl: String?, context: Context) {
        Glide.with(context)
                .load(imageUrl)
                .into(companyLogo)

    }

}