package com.example.nest.adapter


import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.Navigation
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
        if (currentBird.unlocked == true) {
            holder.imageView.setBackgroundColor(Color.GREEN)


        } else {
            holder.imageView.setBackgroundColor(Color.GRAY)
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }
}