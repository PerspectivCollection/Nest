package com.example.nest.screensall.audioquiz

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.nest.R
import com.example.nest.databinding.FragmentAudioGuessBinding
import com.example.nest.model.Bird
import com.example.nest.navigationdraw.AudioquizViewModel
import com.example.nest.screensall.audioquiz.AudioGuessFragmentDirections
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
    ): View? {

        Toast.makeText(context, "${sharedViewModel.birdindex.value?.toInt()}", Toast.LENGTH_LONG)
            .show()

        _binding = FragmentAudioGuessBinding.inflate(inflater, container, false)
        binding.viewModel = sharedViewModel //dot now what dey dom now
        binding.lifecycleOwner = this //dot now what dey dom now

        //todo work fine but make it random
        sharedViewModel.storeAudiGuess((1..34).random())

        Toast.makeText(context, " audio ${sharedViewModel.storeList.toString()}", Toast.LENGTH_LONG)
            .show()

        birdMediaPlayer = sharedViewModel.storeList.last().toInt()?.let {
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

        sharedViewModel.progreebar((sharedViewModel.storeList.size * 20))

        binding.btnOption1id.setOnClickListener()
        {
            val action = AudioGuessFragmentDirections.actionAudioGuessFragmentToFactFragment2()

            action.audioIndexBird = sharedViewModel.storeList.last().toString()

            findNavController().navigate(action)
        }

        binding.btnOption2id.setOnClickListener()
        {
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

    //todo navigate to fact with a argument
    fun navigateNext() {
        findNavController().navigate(R.id.action_guessWhoStartFragment_to_fact_Fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        birdMediaPlayer?.stop()
        _binding = null
    }
}