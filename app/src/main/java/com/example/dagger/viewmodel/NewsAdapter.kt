package com.example.dagger.viewmodel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.dagger.databinding.ItemRowBinding
import com.example.dagger.model.News

class NewsAdapter : ListAdapter<News, NewsAdapter.NewsViewHolder>(NewsComparator()) {

    class NewsViewHolder(private val binding: ItemRowBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(new: News){
            binding.apply {
                this.irTitle.text = new.title
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = getItem(position)
        if(item != null){
            holder.bind(item)
        }
    }

    class NewsComparator : DiffUtil.ItemCallback<News>(){
        override fun areItemsTheSame(oldItem: News, newItem: News): Boolean =
            oldItem.title == newItem.title


        override fun areContentsTheSame(oldItem: News, newItem: News): Boolean = oldItem == newItem

    }
}