package com.example.nest.screensAll

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController

//app
import com.example.nest.R
import com.example.nest.databinding.FragmentFactBinding
import com.example.nest.navigationdraw.GuesswhoViewModel

class FactFragment : Fragment() {
//    private val viewModel: GuesswhoViewModel by viewModels()

    private var _binding : FragmentFactBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFactBinding.inflate(inflater, container, false)
        val View = inflater.inflate(R.layout.fragment_fact, container, false)

//        val args = FactFragmentArgs.fromBundle(requireArguments())

        binding.birdtextId.text

        binding.btnNextId.setOnClickListener(){
            findNavController().navigate(R.id.nav_guesswho)
        }

//        textBirdName.text = textBirdShow.text

//todo make text viwe
        Toast.makeText(context, "${getString(R.string.birdShowStr)}", Toast.LENGTH_LONG).show()

        return binding.root
    }
}