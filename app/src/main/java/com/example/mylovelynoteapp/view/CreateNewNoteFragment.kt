package com.example.mylovelynoteapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.mylovelynoteapp.R

class CreateNewNoteFragment : Fragment() {

    private lateinit var editTextTitle: EditText
    private lateinit var editTextDescrip: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_create_new_note, container, false)

        // Initialize the views
        editTextTitle = view.findViewById(R.id.editTextTitle)
        editTextDescrip = view.findViewById(R.id.editTextDescrip)
        val saveButton = view.findViewById<Button>(R.id.KaydetButton)

        // Set a click listener to the save button
        saveButton.setOnClickListener {
            val title = editTextTitle.text.toString()
            val description = editTextDescrip.text.toString()

            // Here, you can handle the saved data (like storing in a database or whatever you need to do)
            saveData(title, description)
        }

        return view
    }

    private fun saveData(title: String, description: String) {
        // Handle the saving of the data. This is just a dummy function, implement your logic here.
        Toast.makeText(context, "Data saved", Toast.LENGTH_SHORT).show()
    }

}
