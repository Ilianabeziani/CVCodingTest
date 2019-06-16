package com.example.android.myapplication.service.remoteService

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ServiceProvider private constructor() {

    var resumeService: ResumeService? = null
        private set

    init {
        buildRetrofit()
    }

    private fun buildRetrofit() {
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        resumeService = retrofit.create<ResumeService>(ResumeService::class.java)
    }

    companion object {

        private val BASE_URL = "https://raw.githubusercontent.com/"

        private var serviceProvider: ServiceProvider? = null

        val instance: ServiceProvider
            get() {
                if (serviceProvider == null) {
                    serviceProvider = ServiceProvider()
                }

                return serviceProvider!!
            }
    }
}