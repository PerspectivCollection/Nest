package com.example.nest.navigationdraw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nest.R
import com.example.nest.adapter.GalleryAdapter
import com.example.nest.model.GalleryStorage


class GalleryFragment : Fragment() {
    private val movieList: List<GalleryStorage> = GalleryStorage.getGalery()
//    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
//    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
        // Sets the layoutmanager we want to use
//        movieRecyclerView.layoutManager = GridLayoutManager(context, 3)
        //movieRecyclerView.layoutManager = GridLayoutManager(context, 2)
        //movieRecyclerView.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.HORIZONTAL, false)
        //movieRecyclerView.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        //movieRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        //movieRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
//    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
}