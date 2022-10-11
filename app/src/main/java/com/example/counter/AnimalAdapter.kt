package com.example.counter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(private val data: ArrayList<Animal>,private val onKlic: onKlic) :
    RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        return AnimalViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }
    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
   holder.bind()
        holder.itemView.setOnClickListener{
            onKlic.OnItemClick(data.get(position))
        }
    }
    override fun getItemCount(): Int {
        return data.size
    }
   inner class AnimalViewHolder(iteoView: View) : RecyclerView.ViewHolder(iteoView) {
       private lateinit var tvname:TextView
       private lateinit var tvage:TextView
       init {
           tvname=iteoView.findViewById(R.id.tvname)
           tvage = iteoView.findViewById(R.id.tvaeg)
       }
     fun bind(){
        val item = data[adapterPosition]
        tvname.text = item.name
         tvage.text = item.age.toString()
     }
    }
}