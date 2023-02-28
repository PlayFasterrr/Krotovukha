package com.example.krotovukha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.krotovukha.databinding.FragmentIngredientsBinding


class Ingredients : Fragment() {
    private val dataModel: Data by activityViewModels()
    private lateinit var binding: FragmentIngredientsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentIngredientsBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            bWater.setOnClickListener {
                bWater.setBackgroundColor(0xFF6EFE3D.toInt())
                dataModel.something.value = R.drawable.water
            }
            bMole.setOnClickListener {
                bMole.setBackgroundColor(0xFF6EFE3D.toInt())
                dataModel.something.value = R.drawable.mole_water
            }
            bInfusing.setOnClickListener {
                bInfusing.setBackgroundColor(0xFF6EFE3D.toInt())
                dataModel.something.value = R.drawable.day1
            }
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = Ingredients()

    }
}


