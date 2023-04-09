package com.wiryadev.motionlayoutplayground

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.wiryadev.motionlayoutplayground.MoviePosterAdapter.HomeMovieViewHolder
import com.wiryadev.motionlayoutplayground.databinding.ItemMoviePosterBinding

class MoviePosterAdapter(
    private val moviePosters: List<String>,
    private  val onClick: (String) -> Unit,
) : RecyclerView.Adapter<HomeMovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMovieViewHolder {
        return HomeMovieViewHolder(
            ItemMoviePosterBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: HomeMovieViewHolder, position: Int) {
        holder.bind(moviePosters[position])
    }

    override fun getItemCount(): Int = moviePosters.size

    inner class HomeMovieViewHolder(private val binding: ItemMoviePosterBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: String) {
            binding.imgPoster.load(data)
            binding.root.setOnClickListener {
                onClick.invoke(data)
            }
        }
    }
}