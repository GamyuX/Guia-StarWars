package com.example.starwars.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.starwars.R
import com.example.starwars.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.buttonPerson.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_characterFragment)

        }
        binding.buttonPlanet.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_planetsFragment)

        }
        binding.buttonVeicles.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_spaceshipFragment2)

        }
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}