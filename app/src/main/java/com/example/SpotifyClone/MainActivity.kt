package com.example.SpotifyClone

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val username = findViewById<EditText>(R.id.username)
        val passwordUser = findViewById<EditText>(R.id.password)
        val loginButton =findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener{
            val usernameText = username.text.toString()
            val passwordText = passwordUser.text.toString()

            if(usernameText.isNotEmpty() && passwordText.isNotEmpty()) {
                Toast.makeText(this, "Welcome, $usernameText!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Please enter both username and password.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}