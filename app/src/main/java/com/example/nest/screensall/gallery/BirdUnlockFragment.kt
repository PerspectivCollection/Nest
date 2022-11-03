package com.example.nest.screensall.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
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


        // Gets the movie with the uid (just a number in the list in this case)
        val movie = GalleryStorage.getGalery()[args.id]

        // Fills up the views with the movie-information
        /* view.findViewById<TextView>(R.id.movieTitleTextView).text = movie.title
        view.findViewById<ImageView>(R.id.moviePosterImageView).setImageResource(movie.posterUrl)
        view.findViewById<TextView>(R.id.movieDescriptionTextView).text = movie.description*/


        // Fills up the views with the movie-information, accessing the views through the binding-object
        binding.moviePosterImageView.setImageResource(movie.image)
        movie.image?.let { binding.moviePosterImageView.setImageResource(it) }
//        binding.movieDescriptionTextView.text = movie.description
    }
}