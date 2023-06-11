package com.example.a100itemsforserg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.List

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = createItemList()
        adapter = ItemAdapter(items)
        recyclerView.adapter = adapter
    }

    private fun createItemList(): List<String> {
        val items = mutableListOf<String>()
        for (i in 1..100) {
            items.add("Item $i")
        }
        return items
    }
}