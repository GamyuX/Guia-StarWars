package com.example.starwars.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.starwars.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    override fun onViewCreated(view: android.view.View, savedInstanceState: Bundle?) {

        val viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        viewModel.fetchPeople()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}