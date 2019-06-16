package com.example.android.myapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import butterknife.ButterKnife
import com.example.android.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var adapter: ResumeRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButterKnife.bind(this)
        initViews()
        val mainViewModel = ViewModelProviders.of(this).get<MainViewModel>(MainViewModel::class.java)
        mainViewModel.init()


        mainViewModel.myResumeMutableLiveData.observe(this, Observer { resume ->
            if (resume != null) {
                tvName.text = resume.name
                tvTitle.text = resume.title
                tvProffessionalSummary.text = resume.professionalSummary
                tvTechSkills.text = resume.technicalSkills
                adapter.setExperienceList(resume.pastExperience!!)
            }
        })
    }

    private fun initViews() {

        adapter = ResumeRecyclerViewAdapter()
        rvPAstExperiences.layoutManager = LinearLayoutManager(this)
        rvPAstExperiences.adapter = adapter


    }

}
