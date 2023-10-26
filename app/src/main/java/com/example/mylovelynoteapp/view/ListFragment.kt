package com.example.mylovelynoteapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mylovelynoteapp.view.data.Notes
import com.example.mylovelynoteapp.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private var _binding: FragmentListBinding? = null
    private val adapter = MyAdapter(arrayListOf())

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Other code for onViewCreated if necessary

       val action = ListFragmentDirections.actionListFragmentToDetailFragment()

        findNavController().navigate(action)




        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter

        // Populate the adapter with data, if any
        addFragmentData()

    }
    private fun addFragmentData() {
        val notes = arrayListOf(
            Notes("note 1", "description 1"),
            Notes("note 2", "description 2"),
            // ... add more notes for the fragment
        )
        adapter.addNotes(notes)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}


