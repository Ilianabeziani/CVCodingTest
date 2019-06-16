package com.example.android.myapplication.view

import android.util.Log

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.example.android.myapplication.model.Resume
import com.example.android.myapplication.service.Repository

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainViewModel : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    val myResumeMutableLiveData = MutableLiveData<Resume>()

    private var repository: Repository? = null

    fun init() {
        repository = Repository()
        getMyResumeDetails()

    }


    private fun getMyResumeDetails() {
        compositeDisposable.add(repository!!.myResume
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ resume -> myResumeMutableLiveData.setValue(resume) }, { throwable -> Log.d("TAG", throwable.message) }))
    }


    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}
