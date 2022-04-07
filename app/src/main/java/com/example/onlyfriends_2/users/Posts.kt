package com.example.onlyfriends_2.users

data class Posts(
    val image: String,
    val description: String,
    val likes: Int,
    val comments: List<String>,
    val location: String
) {}
