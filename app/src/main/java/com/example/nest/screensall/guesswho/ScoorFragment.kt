package com.example.nest.screensall.guesswho

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.nest.R
import com.example.nest.databinding.FragmentScoorBinding
import com.example.nest.navigationdraw.GuesswhoViewModel

class ScoorFragment : Fragment() {
    private var _binding: FragmentScoorBinding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: GuesswhoViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentScoorBinding.inflate(inflater, container, false)
        binding.viewModel = sharedViewModel //dot now what dey dom now
        binding.lifecycleOwner = this //dot now what dey dom now

        binding.btnNextId.setOnClickListener() {
            sharedViewModel.scoorReset()
            sharedViewModel.resetProgress()
            findNavController().navigate(R.id.action_scoorFragment_to_nav_guesswho)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            scoorFragment = this@ScoorFragment
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}