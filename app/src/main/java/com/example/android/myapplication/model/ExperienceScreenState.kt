package com.example.android.myapplication.model

import java.util.ArrayList

class ExperienceScreenState {


    private var pastExperienceList: MutableList<PastExperience> = ArrayList()


    fun getPastExperienceList(): List<PastExperience> {
        return pastExperienceList
    }

    fun setPastExperienceList(pastExperienceList: MutableList<PastExperience>) {
        this.pastExperienceList = pastExperienceList
    }


    fun addAll(pastExperiences: List<PastExperience>) {
        pastExperienceList.addAll(pastExperiences)
    }

}
