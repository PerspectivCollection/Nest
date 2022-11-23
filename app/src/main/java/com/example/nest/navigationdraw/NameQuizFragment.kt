package com.example.nest.navigationdraw


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

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?


    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_namequiz,container,false)
        binding.btnPlay.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_nav_namequiz_to_qustionQuizGame)

        }

        return binding.root


    }

}
