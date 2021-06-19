package com.example.wdl.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wdl.R
import com.example.wdl.data.LearnedItem
import com.example.wdl.data.UnderstandingLevel

class LearnedItemAdapter: RecyclerView.Adapter<LearnedItemAdapter.LearnedItemViewHolder>() {
    var learnedItems = listOf<LearnedItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnedItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.learned,parent,false)
        return LearnedItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return learnedItems.size
    }

    override fun onBindViewHolder(holder: LearnedItemViewHolder, position: Int) {
        val learnedItem = learnedItems[position]
        holder.bind(learnedItem)
    }

    inner class LearnedItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val titleContainer : TextView = itemView.findViewById(R.id.LearnedTitle)
        private val descriptionContainer : TextView = itemView.findViewById(R.id.LearnedDescripcion)
        private val undestandingLevelContainer : TextView = itemView.findViewById(R.id.Color)


        fun bind(learnedItem: LearnedItem) {
            titleContainer.text = learnedItem.name
            descriptionContainer.text = learnedItem.description
        }

    }
}