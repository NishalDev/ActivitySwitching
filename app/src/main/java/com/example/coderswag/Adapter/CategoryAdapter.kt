package com.example.coderswag.Adapter

import android.content.Context
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

class CategoryAdapter(val context: Context,val categories: List<Category>) : BaseAdapter() {

    override fun getCount(): Int {
        return  categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder
        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.catergory_list_item,null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.catergoryName = categoryView.findViewById(R.id.categoryname)
            categoryView.tag =holder
        }
        else
        {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }
        val category = categories[position]
        holder.catergoryName?.text = category.title
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        return categoryView
    }

    private class ViewHolder{
        var categoryImage : ImageView? = null
        var catergoryName : TextView? = null
    }

}