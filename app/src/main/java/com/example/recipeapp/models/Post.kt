package com.example.recipeapp.models

import com.google.firebase.firestore.PropertyName

data class Post(
    var title: String = "",
    @get:PropertyName( "image_url") @set:PropertyName("image_url") var imageUrl: String = "",
    var description: String = "",
    var category: String = "",
    var user: User? = null
)