package com.example.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.DividerItemDecoration
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todo.ui.Top.MainFragment


class MainActivity : AppCompatActivity() {

    var item_list = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(my_toolbar)

        //val recycler_view: RecyclerView = findViewById(R.id.recyclerview)

        /*val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recycler_view.layoutManager = layoutManager

        val listener = CreateListener2()

        val adapter = RecyclerViewAdapter(item_list)
        recycler_view.adapter = adapter



        //val btClick = findViewById<Button>(R.id.bt_add)
        //bt_add.setOnClickListener(listener)
        mt_add_bt.setOnClickListener(listener)

        /*var sampleList = mutableListOf<String>()
        for (i in 0..10){
            sampleList.add("List$i")
        }*/
        */
    }

    //Menu作成
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    //Menuの操作
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){

            R.id.to_add -> {
                addActivity()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    //CreateActivityに遷移
    fun addActivity(){
        val intent = Intent(this@MainActivity,CreateActivity::class.java)
        startActivity(intent)
    }

    /*private inner class CreateListener2(): View.OnClickListener{

        var count: Int = 0

        fun CreateItemList(title:String) {
            item_list.add(title)
        }
        override fun onClick(v: View) {
            CreateItemList(addText.text.toString())
            count++
            //test_text.text = count.toString()
            Log.d("onClick","ClickStart

        }
    }*/
}