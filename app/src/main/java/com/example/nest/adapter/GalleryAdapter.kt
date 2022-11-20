package com.example.nest.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.nest.R
import com.example.nest.model.Bird


class GalleryAdapter(private val item: List<Bird>) :
    RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.imageunlock)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_unlock, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentBird = item[position]
        holder.imageView.setImageResource(currentBird.image)
    }

    override fun getItemCount(): Int {
        return item.size
    }
}