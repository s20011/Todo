package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.DividerItemDecoration
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val recycler_view: RecyclerView = findViewById(R.id.recyclerview)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recycler_view.layoutManager = layoutManager


        val listener = CreateListener2()
        //val btClick = findViewById<Button>(R.id.bt_add)
        bt_add.setOnClickListener(listener)

        /*var sampleList = mutableListOf<String>()
        for (i in 0..10){
            sampleList.add("List$i")
        }*/


        val adapter = RecyclerViewAdapter(listener.item_List)
        recycler_view.adapter = adapter



    }

    private inner class CreateListener2: View.OnClickListener{

        var count: Int = 0

        var item_List = mutableListOf<String>()

        fun CreateItemList(title:String) {
            item_List.add(title)
        }
        override fun onClick(v: View) {
            CreateItemList(addText.text.toString())
            count++
            test_text.text = count.toString()
            val adapter = RecyclerViewAdapter(item_List)
            recycler_view.adapter = adapter


        }
    }
}