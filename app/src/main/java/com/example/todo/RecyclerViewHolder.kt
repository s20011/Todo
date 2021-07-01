package com.example.todo

import android.widget.TextView
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerViewHolder(view: View): RecyclerView.ViewHolder(view){
    //val text: TextView = view.findViewById(R.id.textview)
    val text: TextView = view.textview
}
