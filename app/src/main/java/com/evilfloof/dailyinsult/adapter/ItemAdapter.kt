package com.evilfloof.dailyinsult.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.evilfloof.dailyinsult.R
import com.evilfloof.dailyinsult.model.Insult

/*
* Adapter for RecyclerView, Holds the Item R.id.item_title
* Uses the layout list_item for each card
* Uses context.resources to get text for list_item (onBind)
 */

class ItemAdapter (private val context: Context,
                   private val dataset: List<Insult>
                   ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /*
     * "Holds" the "View" "Item" for the "Adapter" :floof:
     * in this case just the textView item_title
     */
    class ItemViewHolder (private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val floofView: ImageView = view.findViewById(R.id.item_floof)
    }

    // Create a new View (used by layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.insultResourceId)
        holder.floofView.setImageResource(item.floofResourceId)
    }

    override fun getItemCount() = dataset.size
}