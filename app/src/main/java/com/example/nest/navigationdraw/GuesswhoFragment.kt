package com.example.nest.navigationdraw

//model

//app
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.nest.R
import com.example.nest.databinding.FragmentGuesswhoBinding
import com.example.nest.model.Bird


class GuesswhoFragment : Fragment() {
    private var _binding: FragmentGuesswhoBinding? = null
    private val binding get() = _binding!!
    private val viewModel: GuesswhoViewModel by viewModels()

    //start at index 0 in bird list
//todo generer en tilfeldig liste med birds
    var atNumberIndex = 0

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGuesswhoBinding.inflate(inflater, container, false)
        //data bindet , can now set variabls
        binding.sendBirdData = viewModel
        binding.lifecycleOwner = this

        var args = GuesswhoFragmentArgs.fromBundle(requireArguments())

        viewModel.indexBird = args.indexBird


        Toast.makeText(context, "${viewModel.indexBird}  ferdig", Toast.LENGTH_SHORT).show()

//        atNumberIndex = viewModel.indexBird

        val View = inflater.inflate(R.layout.fragment_guesswho, container, false)
        var Image = View.findViewById<ImageView>(R.id.imagegoosId)

        binding.btnOption1id.text = "Duck"
        binding.btnOption2id.text = "Goose"

        //at image index
//        Bird.getBird().get(atNumberIndex).image?.let { Image.setImageResource(it) }

        //button Duck
        binding.btnOption1id.setOnClickListener() {
//            binding.progressBar.progress += 20

            val action = GuesswhoFragmentDirections.actionNavGuesswhoToFactFragment()
            action.typeBird =
                "Duck".equals(Bird.getBird().get(atNumberIndex).typeBird.toString()) //is statment
            action.textbird = "${Bird.getBird().get(viewModel.indexBird).name.toString()}"
            NavHostFragment.findNavController(this).navigate(action)

//todo: add function update to viewModel
//            atNumberIndex++
        }

        //button Goose
        binding.btnOption2id.setOnClickListener() {
            //            binding.progressBar.progress += 20
            val action = GuesswhoFragmentDirections.actionNavGuesswhoToFactFragment()
            action.typeBird =
                "Goose".equals(Bird.getBird().get(atNumberIndex).typeBird.toString()) //is statment
            action.textbird = "${Bird.getBird().get(viewModel.indexBird).name.toString()}"
            NavHostFragment.findNavController(this).navigate(action)
//

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
    }

    private fun updateBirdUI() {
        //todo: hvor vi vill sende
//            binding.birdtextId.text = getString(R.string.show_bird, viewModel.textbird.value?:0)
//        //todo:


    }
//

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
