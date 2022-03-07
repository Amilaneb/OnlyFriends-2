package com.example.onlyfriends_2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.onlyfriends_2.databinding.CellPostBinding
import com.squareup.picasso.Picasso


class PostAdapter (val post: List<String>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    class PostViewHolder (binding: CellPostBinding): RecyclerView.ViewHolder(binding.root) {
        val image:ImageView = binding.imgPost
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = CellPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val item = post[position]
        Picasso.get().load(item).into(holder.image)

    }

    override fun getItemCount(): Int {
        return post.size
    }

}