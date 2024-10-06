package edu.temple.baseassignment

import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_images : Array<Int>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    private val images = _images

    class ImageViewHolder(_imageView: ImageView) : RecyclerView.ViewHolder(_imageView){
        val imageView = _imageView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ImageView(
                parent.context
            ).apply {
                layoutParams = ViewGroup.LayoutParams(200, 200)
            }
        )
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position])
    }

}