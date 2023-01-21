package com.example.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.Adapter.ProductAdapter
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import com.example.coderswag.Utilities.EXTRA_PRODUCT

import kotlinx.android.synthetic.main.activity_product.*
import kotlinx.android.synthetic.main.product_list_item.*

class ProductActivity : AppCompatActivity(){

    lateinit var adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductAdapter(this, DataService.getProducts(categoryType)){ product ->
            val productDetailsIntent = Intent(this, ProductDetails::class.java)
            productDetailsIntent.putExtra(EXTRA_PRODUCT,product)
            startActivity(productDetailsIntent)
        }


        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation== Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }
        val screenSize = resources.configuration.screenWidthDp
        if(screenSize>720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this,spanCount)
        productListView.layoutManager= layoutManager
        productListView.adapter = adapter
        }

    }

