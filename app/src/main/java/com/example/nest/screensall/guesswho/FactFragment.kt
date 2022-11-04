package com.example.nest.screensall.guesswho

//app
import android.graphics.Color
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
import com.example.nest.model.Bird
import com.example.nest.databinding.FragmentFactBinding
import com.example.nest.navigationdraw.GuesswhoViewModel


class FactFragment : Fragment() {
    private val args: FactFragmentArgs by navArgs()

    private var _binding: FragmentFactBinding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: GuesswhoViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFactBinding.inflate(inflater, container, false)
        binding.viewModel = sharedViewModel
        binding.lifecycleOwner = this


        //no navigate to audio or guess
        binding.btnNextId2.visibility = View.GONE

        sharedViewModel.birdindex.value?.toInt()?.let { it ->
            Bird.getBird()[it].image.let {
                if (it != null) {
                    binding.imageCardView3.setImageResource(it)
                }
            }
        }

        //new bird evry entering fragment
        if (sharedViewModel.birdindex.value != 0){
            binding.birdtextId.text = Bird.getBird()[sharedViewModel.storeList.last().toInt()].name.toString()
        }

        //correct or wrong green or red
        if ((sharedViewModel.typebird.value == true) or args.typeBird) {
            binding.birdtextId.setBackgroundColor(Color.GREEN)
        } else {
            binding.birdtextId.setBackgroundColor(Color.RED)
        }

        //to guesswho
        binding.btnNextId.setOnClickListener() {
            val process = sharedViewModel.progressguess.value?.toInt()!!

            if (process == 100) {
                navigateScoore()
            } else {
                sharedViewModel.progreebar(process)
                sharedViewModel.resetGuess()
                sharedViewModel.updateIndexGuess()
                findNavController().navigate(R.id.action_fact_Fragment_to_guessWhoStartFragment)
            }
        }
        //to audio
        binding.btnNextId2.setOnClickListener() {
            if (sharedViewModel.storeList.size == 5) {
                navigateScoore()
            } else {
                sharedViewModel.resetGuess()
                sharedViewModel.updateIndexGuess()
                navigateNext()
            }
        }

        //show fact card
        binding.btnShowFactId.setOnClickListener() {
            showFact()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedViewModel.setGuessBird(args.audioIndexBird.toInt())


        //to audio btn
        if (args.navigateReapeat) {
            binding.birdtextId.text = Bird.getBird()[args.audioIndexBird.toInt()].name.toString()
            binding.btnNextId2.visibility = View.VISIBLE
        }

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            factfragment = this@FactFragment
        }

    }

    fun navigateNext() {
        val action = FactFragmentDirections.actionFactFragmentToAudioGuessFragment2()
        findNavController().navigate(action)
    }

    fun navigateScoore() {
        findNavController().navigate(R.id.action_fact_Fragment_to_scoorFragment)
    }

    fun showFact() {
        binding.cardViewid.visibility = View.VISIBLE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
