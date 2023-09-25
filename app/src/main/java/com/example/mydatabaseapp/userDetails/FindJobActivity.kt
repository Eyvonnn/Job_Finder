package com.example.mydatabaseapp.userDetails

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import com.example.mydatabaseapp.PostJobActivity
import com.example.mydatabaseapp.R

class FindJobActivity : AppCompatActivity() {
    // ... (other code)

    fun onPostJobClick(view: View) {
        // Create an Intent to navigate to the PostJobActivity
        val intent = Intent(this, PostJobActivity::class.java)
        startActivity(intent)
    }

    // Click handler for the "Find a Job" button
    fun onFindJobClick(view: View) {
        val intent = Intent(this, FindJobActivity::class.java)
        startActivity(intent)
    }
}
