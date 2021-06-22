package com.uchenna.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val validusername = "admin"
    val validpassword = "admin"
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.usernameInput)
        passwordInput = findViewById(R.id.passwordInput)
        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            login(username,password)
        }
    }
    fun login (username :String, password : String){
        if (isvalidcredential(username, password)){
            val intent: Intent=Intent(this,HomeActivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
        }else{
            Toast.makeText(applicationContext, "Login error", Toast.LENGTH_SHORT).show()
        }
    }
    private fun isvalidcredential (username: String, password: String): Boolean{
        if (username == validpassword && password == validpassword) return true
        return false
    }
}