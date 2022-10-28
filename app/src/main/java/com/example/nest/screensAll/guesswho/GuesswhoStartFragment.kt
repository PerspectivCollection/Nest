package com.example.nest.screensAll.guesswho

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.nest.R
import com.example.nest.databinding.FragmentGuessWhoStartBinding
import com.example.nest.navigationdraw.GuesswhoViewModel

class GuesswhoStartFragment : Fragment() {
    private var _binding: FragmentGuessWhoStartBinding? = null
    private val binding get() = _binding!!
    private val viewModel: GuesswhoViewModel by viewModels()


//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val fragmentBinding = FragmentFactBinding.inflate(inflater, container, false)
//        // Inflate the layout for this fragment
//        return fragmentBinding.root
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentGuessWhoStartBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.btnOption1id.setOnClickListener(){
            viewModel.setQuantity(1)
            navigateNext()
        }


//        val args = FactFragmentArgs.fromBundle(requireArguments())
//        viewModel.textbird = args.textbird
////        viewModel.typeBird = args.typeBird
//        binding.birdtextId.text = "${viewModel.textbird}"
//
//        Toast.makeText(context, "${viewModel.lsitsetused.toString()}", Toast.LENGTH_LONG).show()
//
//        //todo make a duck/gouse text
//
//        //todo bytt ut textbird med type duck variabel
//        if (viewModel.typeBird) {
//            binding.birdtextId.setBackgroundColor(Color.GREEN)
//        } else {
//            binding.birdtextId.setBackgroundColor(Color.RED)
//        }
//
//        //todo shift out string with a list that are emty
//        if (viewModel.removeIndexFalse.toString() != "")
//            binding.btnNextId.setOnClickListener() {
//                navigateNext()
//            }
        return binding.root
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