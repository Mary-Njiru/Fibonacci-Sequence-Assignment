package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonacciRecycler(var number: List<Int>):
    RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
       val numberView = LayoutInflater.from(parent.context)
           .inflate(R.layout.numbers_list,parent,false)
        return NumbersViewHolder(numberView)
       }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNum.text = number[position].toString()
    }

    override fun getItemCount(): Int {
        return number.size
      }
    }
class NumbersViewHolder(numberView: View): RecyclerView.ViewHolder(numberView){
    val tvNum = numberView.findViewById<TextView>(R.id.tvNum)
}