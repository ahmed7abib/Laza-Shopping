package com.example.laza.home.models

data class Product(
    val id: Int,
    val image: Int,
    val productTitle: String,
    val productSubDes: String,
    val productPrice: String,
    val productCount: Int? = 1
)