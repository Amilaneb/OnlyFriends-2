package com.example.onlyfriends_2.users

data class User(val email: String, val password: String, val username: String, val posts: List<Posts>) {
}