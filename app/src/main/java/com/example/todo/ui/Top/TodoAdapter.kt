package com.example.todo.ui.Top

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R
import com.example.todo.RecyclerViewHolder
import com.example.todo.ui.Create.Items
import kotlinx.android.synthetic.main.list_item.view.*

class TodoAdapter(
    private val list: MutableList<String>,
    /*private val list: MutableList<Items>,*/
    private val context: Context
): RecyclerView.Adapter<TodoAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val text: TextView = view.textview
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text = list[position]
    }
}