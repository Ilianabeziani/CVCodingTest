package com.example.android.myapplication.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Resume {


    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("professional_summary")
    @Expose
    var professionalSummary: String? = null
    @SerializedName("technical_skills")
    @Expose
    var technicalSkills: String? = null
    @SerializedName("past_experience")
    @Expose
    var pastExperience: List<PastExperience>? = null

}

