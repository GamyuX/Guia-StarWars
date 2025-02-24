package com.example.starwars.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.starwars.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private var binding: FragmentSplashBinding? = null

    override fun onViewCreated(view: android.view.View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashBinding.bind(view)
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
        }, 2000) // Delay de 2 segundos
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}