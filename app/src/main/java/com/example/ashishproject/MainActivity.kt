package com.example.ashishproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import com.example.ashishproject.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.btn.NextUser.setOnClickListener{

          val User = User[i]
          binding.tvUsername.text = User.size - 11
          binding.tvEmail.text = User.size - 13
          binding.tvPassword.text = User.size - 18
      }
      }
    }
}





