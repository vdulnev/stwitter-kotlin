package com.dvn.stwitter_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setSupportActionBar(findViewById(R.id.toolbar))
        title = "STwitter"
        supportActionBar?.subtitle = "simple twitting"
        supportActionBar?.setLogo(R.drawable.ic_launcher_foreground)
        supportFragmentManager.beginTransaction().add(R.id.container, MainFragment(), "MainFragment").commit()
    }
}
