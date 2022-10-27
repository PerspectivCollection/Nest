package com.example.nest.screensAll.guesswho

//app
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.nest.databinding.FragmentFactBinding
import com.example.nest.model.Bird

class FactFragment : Fragment() {
    private var _binding: FragmentFactBinding? = null
    private val binding get() = _binding!!
    private val viewModel: FactViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFactBinding.inflate(inflater, container, false)
        binding.updateBird = viewModel
        binding.lifecycleOwner = this



        val args = FactFragmentArgs.fromBundle(requireArguments())
        viewModel.textbird = args.textbird
        viewModel.typeBird = args.typeBird
        binding.birdtextId.text = "${viewModel.textbird}"

        Toast.makeText(context, "${viewModel.lsitsetused.toString()}", Toast.LENGTH_LONG).show()

        //todo make a duck/gouse text

        //todo bytt ut textbird med type duck variabel
        if (viewModel.typeBird) {
            binding.birdtextId.setBackgroundColor(Color.GREEN)
        } else {
            binding.birdtextId.setBackgroundColor(Color.RED)
        }

        //todo shift out string with a list that are emty
        if (viewModel.removeIndexFalse.toString() != "")
            binding.btnNextId.setOnClickListener() {
                reapeatGuessWho()
            }
        return binding.root
    }

    fun reapeatGuessWho() {
        val some = FactFragmentDirections.actionFactFragmentToNavGuesswho()
        some.removeIndexFalse = true
        NavHostFragment.findNavController(this).navigate(some)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
