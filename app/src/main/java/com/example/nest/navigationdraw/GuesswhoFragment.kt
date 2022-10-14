package com.example.nest.navigationdraw

//model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
//app
import com.example.nest.R
import com.example.nest.databinding.FragmentGuesswhoBinding
import com.example.nest.model.Bird


class GuesswhoFragment : Fragment() {
    //    private val viewModel: GuesswhoViewModel by viewModels()
    private var _binding: FragmentGuesswhoBinding? = null

    private val binding get() = _binding!!

    //start at index 0 in bird list
    private var atNumberIndex = 0


    fun guessFinich() {
        if (atNumberIndex == 4) {
            Toast.makeText(context, "${atNumberIndex}  ferdig", Toast.LENGTH_SHORT).show()
            atNumberIndex = 0
        }
        atNumberIndex++
        findNavController().navigate(R.id.factFragment2)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentGuesswhoBinding.inflate(inflater, container, false)

        val View = inflater.inflate(R.layout.fragment_guesswho, container, false) //root

        var Image = View.findViewById<ImageView>(R.id.imagegoosId)

        binding.btnOption1id.text = "Duck"
        binding.btnOption2id.text = "Goose"


        //at image index
        Toast.makeText(context, "${atNumberIndex}", Toast.LENGTH_SHORT).show()
//        Bird.getBird().get(atNumberIndex).image?.let { Image.setImageResource(it) }

        //button if bird type is duck
        binding.btnOption1id.setOnClickListener() {
            //Image
            if ("Duck".equals(Bird.getBird().get(atNumberIndex).typeBird.toString()))
                Toast.makeText(
                    context,
                    "${Bird.getBird().get(atNumberIndex).name} CORECT",
                    Toast.LENGTH_SHORT
                ).show()

            // a list with 5 questions
            binding.progressBar.progress += 20

            guessFinich()
        }

        //button if bird type is goose
        binding.btnOption2id.setOnClickListener() {
            if ("Goose".equals(Bird.getBird().get(atNumberIndex).typeBird.toString()))
                Toast.makeText(
                    context,
                    "${Bird.getBird().get(atNumberIndex).name} CORECT",
                    Toast.LENGTH_SHORT
                ).show()

            binding.progressBar.progress += 20

            guessFinich()
        }

        return binding.root
    }
//

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }

}
