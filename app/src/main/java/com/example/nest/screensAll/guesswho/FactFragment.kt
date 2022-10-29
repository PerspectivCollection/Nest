package com.example.nest.screensAll.guesswho

//app
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.nest.R
import com.example.nest.databinding.FragmentFactBinding
import com.example.nest.navigationdraw.GuesswhoViewModel

class FactFragment : Fragment() {
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

//        Toast.makeText(activity, "${sharedviewModel.storeList.value.toString()}", Toast.LENGTH_LONG).show()

        //todo bytt ut textbird med type duck variabel
        if (sharedViewModel.typebird.value == true) {
            binding.birdtextId.setBackgroundColor(Color.GREEN)
        } else {
            binding.birdtextId.setBackgroundColor(Color.RED)
        }



        binding.btnNextId.setOnClickListener() {
            var process = sharedViewModel.progressguess.value?.toInt()!!
            sharedViewModel.updateIndexGuess()

            sharedViewModel.progreebar(process)
            //100 prosen complet go to score
            if (process == 100) {
                navigateScoore()
            } else {
                navigateNext()
            }
        }
//todo later display a fact card
        binding.btnShowFactId.setOnClickListener() {
//            showFact()
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            factfragment = this@FactFragment
        }
    }

    // todo repite sycle
    fun navigateNext() {
        findNavController().navigate(R.id.action_fact_Fragment_to_guessWhoStartFragment)
    }

    //todo not jet implementet
    fun navigateScoore() {
        findNavController().navigate(R.id.action_fact_Fragment_to_scoorFragment)
    }

    //todo not jet implementet
    fun showFact() {
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
