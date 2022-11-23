package com.example.nest.screensall.namequiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.nest.R
import com.example.nest.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    lateinit var binding: FragmentResultBinding
    val args: ResultFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_result, container, false)

        binding.btnFinish.setOnClickListener() {
            findNavController().navigate(R.id.action_resultFragment_to_nav_namequiz)
        }

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var amount = args.corecttargs

        binding.tvScore.text = "Your Score is ${amount} out of 10 "
    }

}