package com.example.todo.ui.Top

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.todo.R
import com.example.todo.databinding.MainFragmentBinding
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainFragment: Fragment(R.layout.main_fragment) {
    private var _binding: MainFragmentBinding? = null
    private val binding:MainFragmentBinding get() = _binding!!
    val items = mutableListOf<String>("a","b","c","d","E","g")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this._binding = MainFragmentBinding.bind(view)



        //recyclerview表示
        val recycler_view: RecyclerView = binding.recyclerView
        val layoutManager = LinearLayoutManager(view.context)
        recycler_view.layoutManager = layoutManager
        val adapter = TodoAdapter(items,view.context)
        recycler_view.adapter = adapter



        binding.toCreateBt.setOnClickListener {
            findNavController().navigate(R.id.action_to_create)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        this._binding = null
    }

    fun Navmain(){
        findNavController().navigate(R.id.action_to_create)
    }

    fun NavCreate() {
        findNavController().navigate(R.id.action_to_create)
    }

}