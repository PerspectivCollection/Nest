package com.example.nest.screensall.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.nest.R
import com.example.nest.databinding.FragmentBirdUnlockBinding
import com.example.nest.model.Bird
import com.example.nest.model.GalleryStorage


class BirdUnlockFragment : Fragment() {
    private val args: BirdUnlockFragmentArgs by navArgs()

    private var fragmentBinding: FragmentBirdUnlockBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bird_unlock, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentBirdUnlockBinding.bind(view)
        fragmentBinding = binding

    }
}