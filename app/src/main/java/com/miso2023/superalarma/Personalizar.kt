package com.miso2023.superalarma

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class Personalizar : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personalizar)
        setSupportActionBar(findViewById(R.id.my_toolbar))



        //setting icon
        getSupportActionBar()?.setDisplayShowHomeEnabled(true)
        getSupportActionBar()?.setIcon(R.drawable.baseline_menu_24)

        getSupportActionBar()?.setDisplayShowTitleEnabled(true);
        getSupportActionBar()?.setTitle("Personalizar Alarma")

        val getGuardarButton: Button = findViewById(R.id.guardar)
        val getCancelarButton: Button = findViewById(R.id.cancelar)

        getGuardarButton.setOnClickListener {
            val pantallaPrincipal = Intent(this, MainActivity::class.java)
            startActivity(pantallaPrincipal)
        }

        getCancelarButton.setOnClickListener {
            val pantallaPrincipal2 = Intent(this, MainActivity::class.java)
            startActivity(pantallaPrincipal2)
        }

    }
}