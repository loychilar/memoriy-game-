package com.example.memorygame2023

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.memorygame2023.databinding.ActivityMyRecordBinding

class MyRecordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyRecordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        check()
        binding.restsrtTheGame.setOnClickListener {
            val intent = Intent(this, GameActivitiy::class.java)
            startActivity(intent)
        }

    }

    private fun check() {
        val getRecord: Record = intent.getSerializableExtra("rc") as Record
        if (getRecord.record != "6") {
            binding.recordMe.text = "You Record: ${getRecord.record}"
        } else {
            binding.recordMe.isAllCaps = true
            binding.recordMe.text = "Your area winner: ${getRecord.record}"
            val animation = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.winner)
            binding.rm.startAnimation(animation)
        }
    }

}

