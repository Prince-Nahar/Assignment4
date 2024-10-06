package edu.temple.baseassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_imageItems : Array<ImageItem>) : RecyclerView.Adapter<ImageAdapter.ImageItemViewHolder>() {

    private val imageItem = _imageItems

    inner class ImageItemViewHolder(layout: View) : RecyclerView.ViewHolder(layout){
        val imageView = layout.findViewById<ImageView>(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageItemViewHolder {
        return ImageItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return imageItem.size
    }

    override fun onBindViewHolder(holder: ImageItemViewHolder, position: Int) {
        holder.imageView.setImageResource(imageItem[position].id)
    }

}

