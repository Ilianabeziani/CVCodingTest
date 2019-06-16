package com.example.android.myapplication.service

import com.example.android.myapplication.model.Resume
import com.example.android.myapplication.service.remoteService.RemoteDataSource

import io.reactivex.Single

class Repository {

    internal var resumeDataSource: RemoteDataSource

    val myResume: Single<Resume>
        get() = resumeDataSource.myResume

    init {
        resumeDataSource = RemoteDataSource()
    }

}
