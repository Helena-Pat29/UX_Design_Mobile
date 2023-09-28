package com.miso2023.superalarma

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detener : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detener)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        //setting icon
        getSupportActionBar()?.setDisplayShowHomeEnabled(true)
        getSupportActionBar()?.setIcon(R.drawable.baseline_menu_24)
        getSupportActionBar()?.setDisplayShowTitleEnabled(true);
        getSupportActionBar()?.setTitle("Detener Alarma")

        val getCancelarButton: Button = findViewById(R.id.desactivar_button)

        getCancelarButton.setOnClickListener {
            val pantallaPrincipal2 = Intent(this, MainActivity::class.java)
            startActivity(pantallaPrincipal2)
        }

    }
}