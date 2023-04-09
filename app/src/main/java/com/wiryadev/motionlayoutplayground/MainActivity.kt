package com.wiryadev.motionlayoutplayground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wiryadev.motionlayoutplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnHorizontalRecyclerView.setOnClickListener {
                startActivity(Intent(this@MainActivity, RecyclerViewHorizontalActivity::class.java))
            }
        }
    }
}

const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w185"