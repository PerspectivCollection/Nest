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
import androidx.navigation.fragment.findNavController
import com.example.nest.R
import com.example.nest.databinding.FragmentFactBinding
import com.example.nest.model.Bird
import com.example.nest.navigationdraw.GuesswhoFragmentDirections

class FactFragment : Fragment() {
    private var _binding: FragmentFactBinding? = null

    private val binding get() = _binding!!

    private val viewModel: FactViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFactBinding.inflate(inflater, container, false)
//        val View = inflater.inflate(R.layout.fragment_fact, container, false)

        val args = FactFragmentArgs.fromBundle(requireArguments())

        viewModel.textbird = args.textbird
        binding.birdtextId.text = "${viewModel.textbird}"

        Toast.makeText(context, viewModel.textbird , Toast.LENGTH_LONG).show()

        binding.btnNextId.setOnClickListener(){
            val some = FactFragmentDirections.actionFactFragmentToNavGuesswho()
//            some.textbird = "${Bird.getBird().get(atNumberIndex).name.toString()}"
            NavHostFragment.findNavController(this).navigate(some)
        }

//        textBirdName.text = textBirdShow.text

//todo make text viwe
        Toast.makeText(context, "${getString(R.string.show_bird)}", Toast.LENGTH_LONG).show()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}