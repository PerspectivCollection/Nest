package com.example.nest.screensall.guesswho

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.nest.R
import com.example.nest.databinding.FragmentGuessWhoStartBinding
import com.example.nest.model.Bird
import com.example.nest.navigationdraw.GuesswhoViewModel

class GuesswhoStartFragment : Fragment() {
    private var _binding: FragmentGuessWhoStartBinding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: GuesswhoViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGuessWhoStartBinding.inflate(inflater, container, false)
        binding.viewModel = sharedViewModel //dot now what dey dom now
        binding.lifecycleOwner = this //dot now what dey dom now

        sharedViewModel.updateIndexGuess()

        sharedViewModel.birdindex.value?.toInt()?.let { it ->
            Bird.getBird()[it].image.let {
                if (it != null) {
                    binding.imagegoosId.setImageResource(it)
                }
            }
        }

        if (sharedViewModel.progressguess.value == null)
            sharedViewModel.progreebarstart(0)

        binding.btnOption1id.setOnClickListener() {
            if (sharedViewModel.birdindex.value?.let { it1 -> Bird.getBird()[it1].typeBird.toString() } == "Duck") {
                sharedViewModel.rigthGuess()
            }
            navigateNext()
        }

        binding.btnOption2id.setOnClickListener() {
            if (sharedViewModel.birdindex.value?.let { it1 -> Bird.getBird()[it1].typeBird.toString() } == "Goose") {
                sharedViewModel.rigthGuess()
            }
            navigateNext()
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            startGuesswhoFragment = this@GuesswhoStartFragment
        }
    }

    //repite sycle
    fun navigateNext() {
        findNavController().navigate(R.id.action_guessWhoStartFragment_to_fact_Fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}