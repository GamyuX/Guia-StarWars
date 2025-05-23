package com.example.starwars.ui.spaceship

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.starwars.databinding.FragmentSpaceshipBinding

class SpaceshipFragment : Fragment() {

    private var _binding: FragmentSpaceshipBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel = ViewModelProvider(this)[SpaceshipViewModel::class.java]
        _binding = FragmentSpaceshipBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.buttonVoltar.setOnClickListener {
            requireActivity().onBackPressed()
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}