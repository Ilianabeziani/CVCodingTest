package com.example.android.myapplication.service.remoteService

import com.example.android.myapplication.common.Constant
import com.example.android.myapplication.model.Resume

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ResumeService {

    @GET(Constant.RELATIVE_URL)
    fun getResume(@Query("format") format: String,
                  @Query("access-token") access_token: String): Single<Resume>
}
