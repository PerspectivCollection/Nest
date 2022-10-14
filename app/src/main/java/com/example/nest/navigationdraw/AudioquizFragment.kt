package com.example.nest.navigationdraw

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nest.R

class AudioquizFragment : Fragment() {

    companion object {
        fun newInstance() = AudioquizFragment()
    }

    private lateinit var viewModel: AudioquizViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_audioquiz, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AudioquizViewModel::class.java)
        // TODO: Use the ViewModel
    }

}