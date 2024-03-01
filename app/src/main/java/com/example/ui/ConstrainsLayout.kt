package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ui.databinding.ActivityConstrainsLayoutBinding

class ConstrainsLayout : AppCompatActivity() {
    private lateinit var binding : ActivityConstrainsLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConstrainsLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this,SecondConstrainsLayout::class.java)
            startActivity(intent)
        }
    }
}