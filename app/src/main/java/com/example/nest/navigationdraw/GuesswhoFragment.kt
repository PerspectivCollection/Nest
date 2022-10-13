package com.example.nest.navigationdraw

//model
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.nest.R
import com.example.nest.model.Bird
import java.time.Duration
import java.util.Timer
import kotlin.concurrent.schedule


class GuesswhoFragment : Fragment() {

//    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
//    private val binding get() = _binding!!


    //start at index 0 in bird list
    private var atNumberIndex = 0


    fun guessFinich() {
        if (atNumberIndex == 4) {
            Toast.makeText(context, "${atNumberIndex}  ferdig", Toast.LENGTH_SHORT).show()
            atNumberIndex = 0
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*
//        val slideshowViewModel =
//            ViewModelProvider(this).get(SlideshowViewModel::class.java)
//
//        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        val textView: TextView = binding.textSlideshow
//        slideshowViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        } */


        val View = inflater.inflate(R.layout.fragment_guesswho, container, false) //root
        var Image = View.findViewById<ImageView>(R.id.imagegoosId)


        //Duck
        val Button1 = View.findViewById<Button>(R.id.btnOption1id)

        val Button2 = View.findViewById<Button>(R.id.btnOption2id)

        var process = View.findViewById<ProgressBar>(R.id.progressBar2)


        var TextNamBird = View.findViewById<TextView>(R.id.GetNamBirdId)


        Button1.text = "${Bird.getBird().get(atNumberIndex).typeBird}"


        Button1.setOnClickListener() {
//            Toast.makeText(context, "${(Bird.getBird().get(1).typeBird)}ds } ", Toast.LENGTH_SHORT).show()
//            Toast.makeText(context, "${(Bird.getBird().get(1))} ", Toast.LENGTH_SHORT).show()

            if ("Duck".equals(Bird.getBird().get(atNumberIndex).typeBird)) // return true add +1 to sum
                Toast.makeText(context, "${Button1.text}  tru + 1", Toast.LENGTH_SHORT).show()


            //Todo: put this string in to the next fragment and reapit the prosses
            TextNamBird.text = Bird.getBird().get(atNumberIndex).name.toString()


                Toast.makeText(context, "${atNumberIndex}", Toast.LENGTH_SHORT).show()

            // at numberIndex+ 1
            atNumberIndex++

            // a list with 5 question
            process.progress += 20


            //change image
            Bird.getBird().get(atNumberIndex).image?.let { Image.setImageResource(it) }


            findNavController().navigate(R.id.action_)

//            findNavController().navigate(R.id.fragment_fact)



            guessFinich()
        }

        Button2.setOnClickListener() {

        }


        return View
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
}