package com.example.nest.navigationdraw

//model

//app
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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


//todo set index for witch birds that have bin used. pick cird bast on the last random added

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.lsitsetused.add(10)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentGuesswhoBinding.inflate(inflater, container, false)
        //data bindet , can now set variabls
        binding.sendBirdData = viewModel
        binding.lifecycleOwner = this

//        var some = viewModel.lsitsetused

        var args = GuesswhoFragmentArgs.fromBundle(requireArguments())
        viewModel.removeIndexFalse = args.removeIndexFalse
//        Toast.makeText(context,  Bird.getBird().toString(), Toast.LENGTH_LONG).show()

        if (viewModel.removeIndexFalse) {
            viewModel.whenNext()
        }

//        Toast.makeText(context, "${viewModel.lsitsetused.toString()}", Toast.LENGTH_LONG).show()
//        Toast.makeText(context, "${}", Toast.LENGTH_LONG).show()


//        Toast.makeText(context, "${viewModel.random.toString()} 0  ferdig", Toast.LENGTH_SHORT).show()
        Toast.makeText(context, "${Bird.getBird().get(0).name}", Toast.LENGTH_SHORT).show()

//        var atNumberIndex = viewModel.indexBird


        binding.btnOption1id.text = "Duck"
        binding.btnOption2id.text = "Goose"


        //button Duck
        binding.btnOption1id.setOnClickListener() {
//            binding.progressBar.progress += 20

            viewModel.whenNext()
            Toast.makeText(context, "${viewModel.indexBird}", Toast.LENGTH_SHORT).show()
            Bird.getBird()
                .get(viewModel.indexBird).image?.let { binding.imagegoosId.setImageResource(it) }



//            val action = GuesswhoFragmentDirections.actionNavGuesswhoToFactFragment()
//            action.typeBird =
//                "Duck".equals(Bird.getBird().get(atNumberIndex).typeBird.toString()) //is statment
//            action.textbird = "${Bird.getBird().get(viewModel.indexBird).name.toString()}"
//
//            NavHostFragment.findNavController(this).navigate(action)

//todo: add function update to viewModel
//            atNumberIndex++
        }

        //at image index

        //button Goose
        binding.btnOption2id.setOnClickListener() {
            //            binding.progressBar.progress += 20
            val action = GuesswhoFragmentDirections.actionNavGuesswhoToFactFragment()
            action.typeBird =
                "Goose".equals(
                    Bird.getBird().get(viewModel.indexBird).typeBird.toString()
                ) //is statment
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

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }

}
