package com.example.android.myapplication.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PastExperience {


    @SerializedName("company_name")
    @Expose
    var companyName: String? = null
    @SerializedName("company_logo")
    @Expose
    var companyLogo: String? = null
    @SerializedName("role_name")
    @Expose
    var roleName: String? = null
    @SerializedName("date_from")
    @Expose
    var dateFrom: String? = null
    @SerializedName("date_to")
    @Expose
    var dateTo: String? = null
    @SerializedName("main_responsibility")
    @Expose
    var mainResponsibility: String? = null
    @SerializedName("achievements")
    @Expose
    var achievements: List<String>? = null

}