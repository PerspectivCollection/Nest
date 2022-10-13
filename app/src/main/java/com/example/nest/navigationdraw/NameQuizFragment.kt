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
import com.example.nest.Constanst

class NameQuizFragment : Fragment() {

//    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
//    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val View = inflater.inflate(R.layout.fragment_namequiz, container, false)

        /*
//        val homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)
//
//        _binding = FragmentHomeBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        } */

//        View.findViewById<Button>(R.id.btnOption1id).setOnClickListener() {
//
//            Toast.makeText(context, "f ${(Constanst.getQuestion().get(0))}} ", Toast.LENGTH_LONG).show()
//
//            Toast.makeText(context, "f ${Constanst.getQuestion().get(1)} ", Toast.LENGTH_LONG).show()
//
//        }


        return View
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
}