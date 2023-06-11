package com.example.a100itemsforserg

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class ItemAdapter(
    private val items: List<String>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view=LayoutInflater.from(parent.context)
           .inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=items[position]
        holder.textViewItem.text=item
    }

    override fun getItemCount(): Int {
        return items.size
    }
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView),
            View.OnClickListener{
                val textViewItem: TextView = itemView.findViewById(R.id.textViewItem)
        init{
            itemView.setOnClickListener(this)
        }

        override fun onClick(v:View?){
            val position = adapterPosition
            val clickedItem = items[position]
            Toast.makeText(itemView.context,"Clicked on $clickedItem", Toast.LENGTH_SHORT)
                .show()

        }
    }

}