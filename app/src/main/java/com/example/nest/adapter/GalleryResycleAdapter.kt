package com.example.nest.adapter


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.nest.R
import com.example.nest.model.GalleryStorage


class GalleryAdapter(
    private val items: List<GalleryStorage>
) : RecyclerView.Adapter<GalleryAdapter.MovieViewHolder>() {

    // Called when there's a need for a new ViewHolder (a new item in the list/grid)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        // Log so we can see when the onCreateViewHolder method is called
        Log.d("MovieAdapter", "Creating View")

        // Inflates the movie_list_item.xml to a view for us
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_list_bird, parent, false)

        // Create the viewholder with the corresponding view (list item)
        return MovieViewHolder(itemView)
    }

    // Called when data is bound to a specific ViewHolder (and item in the list/grid)
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return items.size
    }


    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Gets a reference to all the specific views we are going to use or fill with data
        private val moviePosterImageView: ImageView = view.findViewById(R.id.moviePosterImageView)
//        private val movieTitleTextView: TextView = view.findViewById(R.id.movieTitleTextView)

        fun bind(item: GalleryStorage, clickListener: View.OnClickListener) {
            // Fills the views with the given data
            item.image?.let { moviePosterImageView.setImageResource(it) }
//            movieTitleTextView.text = item.name

            // Sets the onClickListener
            itemView.setOnClickListener(clickListener)
        }
    }
}