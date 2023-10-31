package com.example.mylovelynoteapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mylovelynoteapp.databinding.FragmentDetailBinding
import com.example.mylovelynoteapp.adapter.MyAdapter


class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val adapter = MyAdapter(arrayListOf())
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Other code for onViewCreated if necessary





        // Populate the adapter with data, if any
        addFragmentData()



    }
    private fun addFragmentData() {
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    }
