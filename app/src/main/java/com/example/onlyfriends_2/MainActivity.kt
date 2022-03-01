package com.example.onlyfriends_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlyfriends_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listenClick()
    }

    private fun listenClick(){
        binding.connectBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, UserActivity::class.java)
            startActivity(intent)
        }
    }
}