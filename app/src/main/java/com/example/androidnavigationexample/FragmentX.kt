package com.example.androidnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.androidnavigationexample.databinding.FragmentXBinding

class FragmentX : Fragment() {
    private lateinit var binding: FragmentXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentXBinding.inflate(inflater, container, false)

        binding.fragmentYButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentX_to_fragmentY)
        }

        return binding.root
    }
}