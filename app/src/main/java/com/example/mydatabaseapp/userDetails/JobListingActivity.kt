package com.example.mydatabaseapp.userDetails

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mydatabaseapp.R
import job.JobListing
import com.example.mydatabaseapp.userDetails.JobListAdapter

class JobListingsActivity : AppCompatActivity(), JobListAdapter.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.job_list)

        val jobListRecyclerView = findViewById<RecyclerView>(R.id.jobListRecyclerView)
        val jobList = /* Load job data from a database or backend service */

        val jobListAdapter = JobListAdapter(jobList, this)
        jobListRecyclerView.adapter = jobListAdapter
        jobListRecyclerView.layoutManager = LinearLayoutManager(this)

        // Get a reference to the post job button
        val postJobButton = findViewById<Button>(R.id.postJobButton)

        // Set an OnClickListener for the post job button
        postJobButton.setOnClickListener {
            // Handle the button click, e.g., navigate to the PostJobActivity
            val intent = Intent(this, PostJobActivity::class.java)
            startActivity(intent)
        }

        // Other initialization code...
    }

}


