package com.example.wdl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wdl.data.LearnedItem
import com.example.wdl.data.LearnedItemDatabase
import com.example.wdl.databinding.ActivityMainBinding
import com.example.wdl.view.LearnedItemAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recycler = binding.learnedItemRecycleView
        val adapter = LearnedItemAdapter()
        val learnedItems = LearnedItemDatabase.getAll()
        adapter.learnedItems = learnedItems
        recycler.adapter = adapter



    }
}