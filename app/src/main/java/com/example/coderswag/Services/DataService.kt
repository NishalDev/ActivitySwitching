package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats= listOf(
        Product("Infi Cap","4$","hat01"),
        Product("Infi Cap1","8$","hat02"),
        Product("Infi Cap2","10$","hat03"),
        Product("Infi Cap3","12$","hat04")
    )

    val hoodies = listOf(
        Product("Infi Hoodie1","$20","hoodie01"),
        Product("Infi Hoodie2","$24","hoodie02"),
        Product("Infi Hoodie3","$28","hoodie03"),
        Product("Infi Hoodie4","$30","hoodie04")
    )

    val shirts = listOf(
        Product("Infi Shirt1","$40","shirt01"),
        Product("Infi Shirt2","$42","shirt02"),
        Product("Infi Shirt3","$44","shirt03"),
        Product("Infi Shirt4","$46","shirt04")
    )

}