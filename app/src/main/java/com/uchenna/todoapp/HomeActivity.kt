package com.uchenna.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        usernameDisplay = findViewById(R.id.usernameDisplay)
        profileButton = findViewById(R.id.profileButton)

        usernameDisplay.text = intent.getStringExtra("username")
        profileButton.setOnClickListener {openProfilepage()  }


    }
    private fun openProfilepage (){
        val intent = Intent(this,ProfileActivity::class.java)
        startActivity(intent)
    }
}