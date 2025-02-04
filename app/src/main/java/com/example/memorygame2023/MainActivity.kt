package com.example.memorygame2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memorygame2023.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startgame.setOnClickListener {
            val intent = Intent(this, GameActivitiy::class.java)
            startActivity(intent)
        }

            binding.restartgame.setOnClickListener {
            val intent = Intent(this,GameActivitiy::class.java)
            startActivity(intent)
        }
    }
}

