package com.example.nest.navigationdraw

//model

//app
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.nest.R
import com.example.nest.databinding.FragmentGuesswhoBinding
import com.example.nest.model.Bird


class GuesswhoFragment : Fragment() {
    private var _binding: FragmentGuesswhoBinding? = null
    private val binding get() = _binding!!
    private val viewModel: GuesswhoViewModel by viewModels()

    //start at index 0 in bird list
    private var atNumberIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGuesswhoBinding.inflate(inflater, container, false)
        //data bindet , can now set variabls
        binding.sendBirdData = viewModel
        binding.lifecycleOwner = this

        val View = inflater.inflate(R.layout.fragment_guesswho, container, false)
        var Image = View.findViewById<ImageView>(R.id.imagegoosId)

        binding.btnOption1id.text = "Duck"
        binding.btnOption2id.text = "Goose"

        //at image index
//        Bird.getBird().get(atNumberIndex).image?.let { Image.setImageResource(it) }

        //button if bird type is duck
        binding.btnOption1id.setOnClickListener() {
            //Image
//            if ("Duck".equals(Bird.getBird().get(atNumberIndex).typeBird.toString()))
//                Toast.makeText(
//                    context,
//                    "${Bird.getBird().get(atNumberIndex).name} CORECT",
//                    Toast.LENGTH_SHORT
//                ).show()
//
//            // a list with 5 questions
//            binding.progressBar.progress += 20


//            guessFinich()

            val some = GuesswhoFragmentDirections.actionNavGuesswhoToFactFragment()
            some.textbird = "${Bird.getBird().get(atNumberIndex).name.toString()}"
            NavHostFragment.findNavController(this).navigate(some)
//todo: add function update to viewModel
            atNumberIndex++


        }

        //button if bird type is goose
        binding.btnOption2id.setOnClickListener() {
//            if ("Goose".equals(Bird.getBird().get(atNumberIndex).typeBird.toString()))
//                Toast.makeText(
//                    context,
//                    "${Bird.getBird().get(atNumberIndex).name} CORECT",
//                    Toast.LENGTH_SHORT
//                ).show()
//
//            binding.progressBar.progress += 20

            guessFinich()

        }
        updateBirdUI()


        return binding.root
    }

    private fun guessFinich() {
////        if (atNumberIndex == 4) {
////            Toast.makeText(context, "${atNumberIndex}  ferdig", Toast.LENGTH_SHORT).show()
////            atNumberIndex = 0
////        }
////        atNumberIndex++
//
        val action = GuesswhoFragmentDirections.actionNavGuesswhoToFactFragment()

//        action.arguments

        NavHostFragment.findNavController(this).navigate(action)
        findNavController().navigate(R.id.factFragment)

    }

    private fun updateBirdUI() {
        //todo: hvor vi vill sende
//            binding.birdtextId.text = getString(R.string.show_bird, viewModel.textbird.value?:0)
//        //todo:
//        binding.

    }
//

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
