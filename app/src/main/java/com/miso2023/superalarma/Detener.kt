package com.miso2023.superalarma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Detener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detener)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        //setting icon
        getSupportActionBar()?.setDisplayShowHomeEnabled(true)
        getSupportActionBar()?.setIcon(R.drawable.baseline_menu_24)
        getSupportActionBar()?.setDisplayShowTitleEnabled(true);
        getSupportActionBar()?.setTitle("Detener Alarma")

    }
}