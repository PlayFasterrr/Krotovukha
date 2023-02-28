package com.example.krotovukha

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.krotovukha.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val dataModel: Data by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ivHat.visibility = View.INVISIBLE
        binding.bottomMenu.selectedItemId = R.id.banka
        binding.bottomMenu.setOnNavigationItemSelectedListener { it ->
            when (it.itemId) {
                R.id.banka -> {
                    binding.fragment.visibility = View.GONE
                }

                R.id.ingredients -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment, Ingredients.newInstance())
                        .commit()
                    binding.apply {
                        fragment.visibility = View.VISIBLE
                    }
                    dataModel.something.observe(this) {
                        binding.ivBanka.setImageResource(it)
                    }

                }

                R.id.lights -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment, Lights.newInstance())
                        .commit()
                    binding.fragment.visibility = View.VISIBLE
                }

                R.id.settings -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment, Settings.newInstance())
                        .commit()
                    binding.apply {
                        fragment.visibility = View.VISIBLE
                    }
                    dataModel.hat.observe(this) {
                        binding.ivHat.visibility = it as Int
                    }
                }
            }
            true
        }

    }
}







