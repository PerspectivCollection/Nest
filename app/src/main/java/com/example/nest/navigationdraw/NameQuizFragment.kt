package com.example.nest.navigationdraw


//model
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.nest.R
import com.example.nest.databinding.FragmentNamequizBinding
import com.example.nest.model.Question

class NameQuizFragment : Fragment() {
    lateinit var binding: FragmentNamequizBinding


    private lateinit var questionList: ArrayList<Question>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_namequiz, container, false)

        binding.btnPlay.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_nav_namequiz_to_qustionQuizGame)
        }

        binding.shareBtn.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"))
            startActivity(intent)
        }

        return binding.root
    }

}
