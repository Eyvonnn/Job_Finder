package com.example.mydatabaseapp.userDetails

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mydatabaseapp.FindJobActivity
import com.example.mydatabaseapp.R

class PostJobActivity : AppCompatActivity() {
    // ... (other code)

    fun onFindJobClick(view: View) {
        // Create an Intent to navigate to the FindJobActivity
        val intent = Intent(this, FindJobActivity::class.java)
        startActivity(intent)
    }

    // ... (other code)
}
