package com.example.mydatabaseapp.userDetails
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mydatabaseapp.R
import job.JobListing

class JobListAdapter(private val jobList: List<JobListing>, private val clickListener: OnClickListener) :
    RecyclerView.Adapter<JobListAdapter.ViewHolder>() {

    // Interface for item click handling
    interface OnClickListener {
        fun onItemClick(job: JobListing)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.jobTitleEditText)
        val descriptionTextView: TextView = itemView.findViewById(R.id.jobDescriptionEditText)
        val locationTextView: TextView = itemView.findViewById(R.id.locationEditText)

        init {
            // Set an OnClickListener for the item
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val job = jobList[position]
                    clickListener.onItemClick(job)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.job_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val job = jobList[position]

        holder.titleTextView.text = job.title
        holder.descriptionTextView.text = job.description
        holder.locationTextView.text = job.location
    }

    override fun getItemCount(): Int {
        return jobList.size
    }
}
