package com.montassarbellahabdallah.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.montassarbellahabdallah.dogglers.adapter.DogCardAdapter
import com.montassarbellahabdallah.dogglers.const.Layout
import com.montassarbellahabdallah.dogglers.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
