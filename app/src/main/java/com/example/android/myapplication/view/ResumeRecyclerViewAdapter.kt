package com.example.android.myapplication.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.android.myapplication.R
import com.example.android.myapplication.model.PastExperience

import java.util.ArrayList

class ResumeRecyclerViewAdapter : RecyclerView.Adapter<ResumeViewHolder>() {

    internal var experienceList: MutableList<PastExperience> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResumeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.recycler_view_item, parent, false)
        return ResumeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResumeViewHolder, position: Int) {
        val pastExperience = experienceList[position]
        holder.bind(pastExperience)


    }

    override fun getItemCount(): Int {
        return experienceList.size
    }

    fun setExperienceList(experience: List<PastExperience>) {
        if (!experienceList.isEmpty()) {
            experienceList.clear()
        } else {
            experienceList.addAll(experience)
            notifyDataSetChanged()
        }
    }
}