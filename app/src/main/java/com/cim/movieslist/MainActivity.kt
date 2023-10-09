package com.cim.movieslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cim.movieslist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setUpBottomNavigation()
    }

    private fun setUpBottomNavigation() {
        binding?.navView?.menu?.getItem(2)?.isEnabled = false
    }
}