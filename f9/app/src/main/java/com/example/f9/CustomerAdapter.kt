package com.example.f9

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CustomerAdapter (val customers : ArrayList<Customer>,val context: Context):
    RecyclerView.Adapter<CustomerAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false)
       // val click = LayoutInflater.from(context).inflate(R.layout.menu,parent,false)
        return MyViewHolder(view,context)
    }

    override fun getItemCount(): Int {
        return customers.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val customer = customers.get(position)
        holder.nameText.text = customer.name
        holder.descriptionText.text = customer.description
    }
    class MyViewHolder(view: View, context: Context): RecyclerView.ViewHolder(view){
        var nameText: TextView = view.findViewById(R.id.name)
        var descriptionText: TextView = view.findViewById(R.id.description)
        init {
            view.setOnClickListener{
                //menu.click
                //Toast.makeText(context, nameText.text, Toast.LENGTH_SHORT).show()

            }
        }
    }
}