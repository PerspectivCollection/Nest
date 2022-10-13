package com.example.nest.navigationdraw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nest.R


class GalleryFragment : Fragment() {

//    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
//    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val galleryViewModel =
//            ViewModelProvider(this).get(GalleryViewModel::class.java)
//
//        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        val textView: TextView = binding.textGallery
//        galleryViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }


//        Toast.makeText(context, (Constanst.getQuestion().get(0).toString()), Toast.LENGTH_LONG).show()

        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
}