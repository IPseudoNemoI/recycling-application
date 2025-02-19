package com.example.recycler

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.recycler.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_menu)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
           R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        // setupActionBarWithNavController(navController, appBarConfiguration)
         navView.setupWithNavController(navController)

//        change imageView resource
//        val mainObject = findViewById<ImageView>(R.id.image_object)
//        mainObject.setImageResource(R.drawable.heart)
    }
}