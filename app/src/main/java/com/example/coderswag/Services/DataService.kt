package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats= listOf(
        Product("Infi Cap","4$","hat1"),
        Product("Infi Cap1","8$","hat2"),
        Product("Infi Cap2","10$","hat3"),
        Product("Infi Cap3","12$","hat4"),
        Product("Infi Cap","4$","hat1"),
        Product("Infi Cap1","8$","hat2"),
        Product("Infi Cap2","10$","hat3"),
        Product("Infi Cap3","12$","hat4")
    )

    val hoodies = listOf(
        Product("Infi Hoodie1","$20","hoodie1"),
        Product("Infi Hoodie2","$24","hoodie2"),
        Product("Infi Hoodie3","$28","hoodie3"),
        Product("Infi Hoodie4","$30","hoodie4"),
        Product("Infi Hoodie1","$20","hoodie1"),
        Product("Infi Hoodie2","$24","hoodie2"),
        Product("Infi Hoodie3","$28","hoodie3"),
        Product("Infi Hoodie4","$30","hoodie4")
    )

    val shirts = listOf(
        Product("Infi Shirt1","$40","shirt1"),
        Product("Infi Shirt2","$42","shirt2"),
        Product("Infi Shirt3","$44","shirt3"),
        Product("Infi Shirt4","$46","shirt4"),
        Product("Infi Shirt1","$40","shirt1"),
        Product("Infi Shirt2","$42","shirt2"),
        Product("Infi Shirt3","$44","shirt3"),
        Product("Infi Shirt4","$46","shirt4")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String?) : List<Product> {

        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }

}