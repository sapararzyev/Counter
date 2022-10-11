package com.example.counter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MainFragment : Fragment() {
    private  var arrayList = arrayListOf<Animal>()
    private lateinit  var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView=view.findViewById(R.id.recyclerView)

        arrayList.add(Animal("cacadu", age = 20))
        arrayList.add(Animal("camel", age = 30))
        arrayList.add(Animal("limur", age = 4))
        arrayList.add(Animal("monkey", age = 3))
        arrayList.add(Animal("dog", age = 12))
        arrayList.add(Animal("cat", age = 2))
        arrayList.add(Animal("tiger", age = 25))
        arrayList.add(Animal("woig", age = 5))
        arrayList.add(Animal("Giraffe", age = 26))

       val adapter=AnimalAdapter(arrayList, object : onKlic{
           override fun OnItemClick(animal: Animal) {
               Toast.makeText(requireContext(),"Name:"+ animal.name +"Age:"+animal.age , Toast.LENGTH_SHORT).show()
           }

       })
               recyclerView.adapter = adapter


    }
}