package com.example.nest.navigationdraw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.example.nest.R
import com.example.nest.databinding.FragmentAudioquizBinding
import com.example.nest.databinding.FragmentGuesswhoBinding

class AudioquizFragment : Fragment() {

    private var _binding: FragmentAudioquizBinding? = null
    private val binding get() = _binding!!
    private val viewModel: AudioquizViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding= FragmentAudioquizBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        binding.btnStartId.setOnClickListener() {
            navigateNext()
        }

        return binding.root
    }

    fun navigateNext() {
        val action = AudioquizFragmentDirections.actionNavAudioquizToAudioGuessFragment()
        NavHostFragment.findNavController(this).navigate(action)
    }
}