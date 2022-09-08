package com.example.recyclergrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var list: List<Model>
    private lateinit var adapter: RecyclerAdapter
    private lateinit var manager:GridLayoutManager
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recycler)
        list=listOf(
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.tick,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.tick,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),Model(R.drawable.icon,"Image"),
            Model(R.drawable.img,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            Model(R.drawable.icon,"Image"),
            )
        adapter=RecyclerAdapter(list)
        manager=GridLayoutManager(this,3)
        //manager.gapStrategy=StaggeredGridLayoutManager.GAP_HANDLING_NONE
        recyclerView.adapter=adapter
        recyclerView.layoutManager=manager
    }
}