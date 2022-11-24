package com.example.nest.navigationdraw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nest.R
import com.example.nest.adapter.GalleryAdapter
import com.example.nest.model.Bird

class GalleryFragment : Fragment() {
    private val birdCollection : List<Bird> = Bird.getBird()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }
//https://www.geeksforgeeks.org/android-recyclerview-in-kotlin/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.birdRecyclerView)

        recycler?.layoutManager = LinearLayoutManager(activity)

        val adapter = GalleryAdapter(birdCollection.subList(1,100))//update value the more images are added - 1

        recycler.layoutManager = GridLayoutManager(context, 2)

        recycler.adapter = adapter
    }
}