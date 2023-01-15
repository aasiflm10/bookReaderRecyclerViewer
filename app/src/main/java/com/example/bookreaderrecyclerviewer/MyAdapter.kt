package com.example.bookreaderrecyclerviewer

import android.graphics.Rect
import android.graphics.drawable.shapes.Shape
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.NonDisposableHandle.parent


class MyAdapter(private val booksList : ArrayList<Books>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val bookname : TextView = itemView.findViewById(R.id.book_name)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val itemView = LayoutInflater.from(p0.context).inflate(R.layout.list_item, p0, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        val currentItem = booksList[p1]
        p0.titleImage.setImageResource(currentItem.title_Image)
        p0.bookname.text = currentItem.book_Name
    }

    override fun getItemCount(): Int {
        return booksList.size
    }


}