package com.example.todo

import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CreateListener: View.OnClickListener,AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    var item_List = mutableListOf<String>()

    fun CreateItemList(title:String) {
        item_List.add(title)
    }
    override fun onClick(v: View) {
        CreateItemList(addText.text.toString())
        val adapter = RecyclerViewAdapter(item_List)
        recycler_view.adapter = adapter

    }
}