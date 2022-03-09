package com.iasd.conteo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
   /* HomeFragment homeFragment = new HomeFragment();
    AssistantsFragment assistantsFragment = new = AssistantsFragment();
    SettingsFragment settingsFragment = SettingsFragment();
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /*val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
       val navController = findNavController(R.id.fragmentContainerView2)*/

       val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
       val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
       bottomNavigationView.setupWithNavController(navHostFragment.navController)


       val navController = navHostFragment.navController
       val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment, R.id.assistantsFragment, R.id.settingsFragment))
       setupActionBarWithNavController(navController, appBarConfiguration)





    }


}