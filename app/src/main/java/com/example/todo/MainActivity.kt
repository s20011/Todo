package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.DividerItemDecoration
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {

    var item_list = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val recycler_view: RecyclerView = findViewById(R.id.recyclerview)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recycler_view.layoutManager = layoutManager

        val adapter = RecyclerViewAdapter(item_list)
        recycler_view.adapter = adapter


        val listener = CreateListener2()
        //val btClick = findViewById<Button>(R.id.bt_add)
        //bt_add.setOnClickListener(listener)
        mt_add_bt.setOnClickListener(listener)

        /*var sampleList = mutableListOf<String>()
        for (i in 0..10){
            sampleList.add("List$i")
        }*/

    }

    private inner class CreateListener2(): View.OnClickListener{

        var count: Int = 0

        fun CreateItemList(title:String) {
            item_list.add(title)
        }
        override fun onClick(v: View) {
            CreateItemList(addText.text.toString())
            count++
            test_text.text = count.toString()
            Log.d("onClick","ClickStart")



        }
    }
}