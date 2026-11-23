package com.example.apia

sealed interface ApiService{
    @GET("/posts")
    suspend fun getPosts(): List<Post>

}

data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
    val comments: List<Comment>
)


