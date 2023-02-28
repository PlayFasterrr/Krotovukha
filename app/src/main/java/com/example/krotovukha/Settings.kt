package com.example.krotovukha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.krotovukha.databinding.FragmentSettingsBinding


class Settings : Fragment() {
    private val dataModel: Data by activityViewModels()
    private lateinit var binding: FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            bStandart.setBackgroundColor(0xFF6EFE3D.toInt())
            bStandart.setOnClickListener {
                bStandart.setBackgroundColor(0xFF6EFE3D.toInt())
                bXMas.setBackgroundColor(0xFFFFFFFF.toInt())
                dataModel.hat.value = View.GONE
            }
            bXMas.setOnClickListener {
                bXMas.setBackgroundColor(0xFF6EFE3D.toInt())
                bStandart.setBackgroundColor(0xFFFFFFFF.toInt())
                dataModel.hat.value = View.VISIBLE
            }
        }


    }

    companion object {

        @JvmStatic
        fun newInstance() = Settings()

    }
}