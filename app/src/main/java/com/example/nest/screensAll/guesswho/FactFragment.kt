package com.example.nest.screensAll.guesswho

//app
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.nest.databinding.FragmentFactBinding

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
        binding.birdtextId.text = "${viewModel.textbird}"

        Toast.makeText(context, viewModel.textbird, Toast.LENGTH_LONG).show()

        //add on index
//        Toast.makeText(context, viewModel.indexBird, Toast.LENGTH_LONG).show()

        binding.btnNextId.setOnClickListener() {
            val some = FactFragmentDirections.actionFactFragmentToNavGuesswho()
            some.indexBird = viewModel.indexBird.value?:0
            NavHostFragment.findNavController(this).navigate(some)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}