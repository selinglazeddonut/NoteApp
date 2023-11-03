package com.example.mylovelynoteapp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.example.mylovelynoteapp.R
import com.example.mylovelynoteapp.adapter.MyAdapter
import com.example.mylovelynoteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter = MyAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




       //navigation için main.xml'de tanımlanan (nav_host id'si olan) fragment container view'i bağladık.
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
        if (navHostFragment is NavHostFragment) {
            val navController = navHostFragment.navController


        }



      /**  override fun onSupportNavigateUp(): Boolean {
            navHostFragment.navController.navigateUp()
            return super.onSupportNavigateUp() **/
        }



    }

