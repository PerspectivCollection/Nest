package com.example.nest.namequiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.nest.R
import com.example.nest.databinding.FragmentQustionQuizGameBinding


class QustionQuizGame : Fragment() {
    lateinit var binding: FragmentQustionQuizGameBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_qustion_quiz_game, container, false)
        return binding.root


    }
}