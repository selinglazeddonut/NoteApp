package com.example.mylovelynoteapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.mylovelynoteapp.R
import com.example.mylovelynoteapp.data.Notes
import com.example.mylovelynoteapp.view.ListFragmentDirections
import com.example.mylovelynoteapp.view.ListFragmentDirections.Companion.actionListFragmentToDetailFragment

class MyAdapter(val notesList: ArrayList<Notes>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    private var noteList = emptyList<Notes>()
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleTextView)
    }
    fun addNotes(Notes: List<Notes>) {
        notesList.clear() //bug
        notesList.addAll(Notes)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return MyViewHolder((itemView))
    }


    override fun getItemCount(): Int {
        return notesList.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = notesList[position]
        // Burada tıklanan notun işlemlerini yapabilirsin.
        // Örneğin DetailFragment'a geçiş için.

        holder.title.text = currentItem.title

        holder.itemView.setOnClickListener {
            val action = ListFragmentDirections.actionListFragmentToDetailFragment()
            holder.itemView.findNavController().navigate(action)
        }
    }
        /** holder.bind(currentItem) { note ->
        val action = ListFragmentDirections.actionListFragmentToDetailFragment()
        holder.itemView.findNavController().navigate(action)
        } */
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title: TextView = itemView.findViewById(R.id.titleTextView)




        /** fun bind(notes: Notes, clickListener: (Notes) -> Unit) {

        title.text = notes.title

        itemView.setOnClickListener { clickListener(notes) } */



    }



