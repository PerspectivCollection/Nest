package com.example.nest.navigationdraw

import android.os.Bundle
import android.text.InputFilter.LengthFilter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

import com.example.nest.R


//model
import com.example.nest.databinding.FragmentGuesswhoBinding

class NameQuizFragment : Fragment() {

    private var _binding: FragmentGuesswhoBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val View = inflater.inflate(R.layout.fragment_namequiz, container, false)

//        binding.  binding.textView2.text


        return View
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
}