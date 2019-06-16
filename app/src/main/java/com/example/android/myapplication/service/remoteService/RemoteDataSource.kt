package com.example.android.myapplication.service.remoteService

import com.example.android.myapplication.common.Constant
import com.example.android.myapplication.model.Resume

import io.reactivex.Single

class RemoteDataSource {

    internal var resumeService: ResumeService? = null

    val myResume: Single<Resume>
        get() = resumeService!!.getResume(Constant.FORMAT, Constant.ACCESS_TOKEN)

    init {
        resumeService = ServiceProvider.instance.resumeService
    }

}