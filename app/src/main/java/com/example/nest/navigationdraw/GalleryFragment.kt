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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycler = view.findViewById<RecyclerView>(R.id.birdRecyclerView)

        recycler?.layoutManager = LinearLayoutManager(activity)

//         This will pass the ArrayList to our Adapter

//        val data = ArrayList<Bird>()
//
//        for (i in 1..20) {
//            data.add(Bird.getBird()[i].image)
//        }

        val adapter = GalleryAdapter(birdCollection)
//todo change layout to 3 or somthing
        recycler.layoutManager = GridLayoutManager(context, 2)

        recycler.adapter = adapter
    }
}