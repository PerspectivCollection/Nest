package com.example.nest.screensall.audioquiz

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.nest.R
import com.example.nest.databinding.FragmentAudioGuessBinding
import com.example.nest.model.Bird
import com.example.nest.navigationdraw.AudioquizViewModel

class AudioGuessFragment : Fragment() {
    private var _binding: FragmentAudioGuessBinding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: AudioquizViewModel by activityViewModels()

    var birdMediaPlayer: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        Toast.makeText(context, "${sharedViewModel.storeList.toString()}", Toast.LENGTH_LONG).show()

        _binding = FragmentAudioGuessBinding.inflate(inflater, container, false)
        binding.viewModel = sharedViewModel //dot now what dey dom now
        binding.lifecycleOwner = this //dot now what dey dom now


        if (sharedViewModel.birdindex.value == null)
            sharedViewModel.setGuessBird(0)


//        sharedViewModel.birdindex.value?.toInt()?.let { it ->
//            Bird.getBird()[it].image.let {
//                if (it != null) {
//                    binding.imagegoosId.setImageResource(it)
//                }
//            }
//        }


        birdMediaPlayer = MediaPlayer.create(context, R.raw.american_wigeon)

        binding.playButton.setOnClickListener() {
            birdMediaPlayer?.start()

        }


        if (sharedViewModel.progressguess.value == null)
            sharedViewModel.progreebarstart(0)

        binding.btnOption1id.setOnClickListener() {
            if (sharedViewModel.birdindex.value?.let { it1 -> Bird.getBird()[it1].typeBird.toString() } == "Duck") {
                sharedViewModel.rigthGuess()
            }
            navigateNext() //todo put this in a if
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
            audioGuess = this@AudioGuessFragment
        }
    }

    //repite sycle
    fun navigateNext() {
        findNavController().navigate(R.id.action_guessWhoStartFragment_to_fact_Fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        birdMediaPlayer?.stop()
        _binding = null
    }
}