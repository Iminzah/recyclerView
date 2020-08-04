package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_name_item.view.*

class NamesRecyclerViewAdapter(
    val namesList: List<Any>,
    name: Any,
    name1: Any,
    name2: Any,
    name3: Any,
    name4: Any,
    name5: Any,
    name6: Any
) :
    RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_name_item, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return namesList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvName.text = namesList[position].toString()
        holder.rowView.tvName.text=person.name
        holder.rowView.tvName.text=person.age
        holder.rowView.tvName.text=person.dob
        holder.rowView.tvName.text=person.hobby
    }
    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}
