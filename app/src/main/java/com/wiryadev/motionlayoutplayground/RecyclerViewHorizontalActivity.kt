package com.wiryadev.motionlayoutplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.wiryadev.motionlayoutplayground.databinding.ActivityRecyclerViewHorizontalBinding

class RecyclerViewHorizontalActivity : AppCompatActivity() {

    companion object {

        val moviePosters = listOf(
            "$IMAGE_BASE_URL/qNBAXBIQlnOThrVvA6mA2B5ggV6.jpg",
            "$IMAGE_BASE_URL/vZloFAK7NmvMGKE7VkF5UHaz0I.jpg",
            "$IMAGE_BASE_URL/kuf6dutpsT0vSVehic3EZIqkOBt.jpg",
            "$IMAGE_BASE_URL/A3ZbZsmsvNGdprRi2lKgGEeVLEH.jpg",
            "$IMAGE_BASE_URL/ngl2FKBlU4fhbdsrtdom9LVLBXw.jpg",
            "$IMAGE_BASE_URL/6LuXaihVIoJ5FeSiFb7CZMtU7du.jpg",
            "$IMAGE_BASE_URL/6DrHO1jr3qVrViUO6s6kFiAGM7.jpg",
            "$IMAGE_BASE_URL/62HCnUTziyWcpDaBO2i1DX17ljH.jpg",
        )
    }

    private lateinit var binding: ActivityRecyclerViewHorizontalBinding

    private lateinit var posterAdapter: MoviePosterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewHorizontalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        posterAdapter = MoviePosterAdapter(moviePosters) {
            Snackbar.make(binding.root, it, Snackbar.LENGTH_SHORT).show()
        }

        binding.rvPoster.apply {
            layoutManager = LinearLayoutManager(
                this@RecyclerViewHorizontalActivity,
                LinearLayoutManager.HORIZONTAL,
                false,
            )
            adapter = posterAdapter
            setHasFixedSize(true)
//            setOnTouchListener { v, event ->
//                Log.d("OnTouchListener", "event: $event")
//                binding.motionLayoutHorizontal.onTouchEvent(event)
////                v.performClick()
//                return@setOnTouchListener false
//            }
        }
    }
}