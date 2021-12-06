package com.example.spotify.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spotify.R
import com.example.spotify.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var authBinding: ActivityAuthBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authBinding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(authBinding.root)
    }
}