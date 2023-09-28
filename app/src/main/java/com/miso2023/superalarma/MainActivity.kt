package com.miso2023.superalarma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Included card layout references
        val crearAlarmaCard: View = findViewById(R.id.crear_alarma_card)


        // Button references within each card
        val crearAlarmaButton: Button = crearAlarmaCard.findViewById(R.id.alarm_action_button)
        val personalizarAlarmaButton: Button = findViewById(R.id.personalizar_button)
        val detenerAlarmaButton: Button = findViewById(R.id.detener_buton)

        // Setting onClick listeners
        crearAlarmaButton.setOnClickListener {
            val crearAlarma = Intent(this, CrearAlarmaActivity::class.java)
            startActivity(crearAlarma)
        }

        personalizarAlarmaButton.setOnClickListener {
            val personalizarAlarma = Intent(this, Personalizar::class.java)
            startActivity(personalizarAlarma)
        }


        detenerAlarmaButton.setOnClickListener {
            val detenerAlarma = Intent(this, Detener::class.java)
            startActivity(detenerAlarma)
        }


    }
}
