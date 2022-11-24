package com.example.nest.screensall.audioquiz

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.nest.databinding.FragmentAudioGuessBinding
import com.example.nest.model.Bird
import com.example.nest.navigationdraw.AudioquizViewModel
import com.example.nest.screensall.guesswho.FactFragmentArgs

class AudioGuessFragment : Fragment() {

    val args: FactFragmentArgs by navArgs()


    private var _binding: FragmentAudioGuessBinding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: AudioquizViewModel by activityViewModels()

    var birdMediaPlayer: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        if (sharedViewModel.storeList.size >= 6) {
            sharedViewModel.resetProgress()
        }

        sharedViewModel.storeAudiGuess((1..33).random())

        _binding = FragmentAudioGuessBinding.inflate(inflater, container, false)
        binding.viewModel = sharedViewModel
        binding.lifecycleOwner = this

        sharedViewModel.resetGuess()

        birdMediaPlayer = sharedViewModel.storeList.last().toInt().let {
            Bird.getBird().get(it).audio?.let {
                MediaPlayer.create(
                    context,
                    it
                )
            }
        }

        binding.playButton.setOnClickListener()
        {
            birdMediaPlayer?.start()
        }

        if (sharedViewModel.progressguess.value == null)
            sharedViewModel.progreebarstart(0)

        binding.btnOption1id.setOnClickListener()
        {
            sharedViewModel.progreebarstart(sharedViewModel.storeList.size * 20)

            if (sharedViewModel.birdindex.value?.let { it1 -> Bird.getBird()[it1].typeBird.toString() } == "Duck") {
                sharedViewModel.rigthGuess()
            }
            navigateNext()
        }

        binding.btnOption2id.setOnClickListener()
        {
            sharedViewModel.progreebarstart(sharedViewModel.storeList.size * 20)

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

        sharedViewModel.setGuessBird(args.audioIndexBird.toInt())
    }

    //navigate to fact with a argument index, true/false, true
    fun navigateNext() {
        val action = AudioGuessFragmentDirections.actionAudioGuessFragmentToFactFragment2()
        action.audioIndexBird = sharedViewModel.storeList.last().toString()
        action.typeBird = sharedViewModel.typebird.value == true
        action.navigateReapeat = true

        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        birdMediaPlayer?.stop()
        _binding = null
    }
}
