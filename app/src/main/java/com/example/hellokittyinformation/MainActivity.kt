package com.example.hellokittyinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.hellokittyinformation.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavigationUI.setupWithNavController(
            bottom_navigation, findNavController(R.id.navigation_host)
        )

        NavigationUI.setupActionBarWithNavController(
            this,
            findNavController(R.id.navigation_host),
            AppBarConfiguration(
                setOf(
                    R.id.infoFragment,
                    R.id.shopFragment,
                    R.id.timerFragment
                )
            )
        )
    }//end of onCreate

    override fun onSupportNavigateUp() = findNavController(R.id.navigation_host).navigateUp()
}
