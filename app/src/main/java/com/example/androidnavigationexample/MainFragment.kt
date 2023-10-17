package com.example.androidnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.androidnavigationexample.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.fragmentAButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_fragmentA)
        }

        binding.fragmentXButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_fragmentX)
        }

        return binding.root
    }
}