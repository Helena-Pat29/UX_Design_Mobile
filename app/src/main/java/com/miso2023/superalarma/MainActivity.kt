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
        val personalizarAlarmaCard: View = findViewById(R.id.personalizar_alarma_card)
        val editarAlarmaCard: View = findViewById(R.id.editar_alarma_card)
        val detenerAlarmaCard: View = findViewById(R.id.detener_alarma_card)

        // Button references within each card
        val crearAlarmaButton: Button = crearAlarmaCard.findViewById(R.id.alarm_action_button)
        val personalizarAlarmaButton: Button = personalizarAlarmaCard.findViewById(R.id.alarm_action_button)
        val editarAlarmaButton: Button = editarAlarmaCard.findViewById(R.id.alarm_action_button)
        val detenerAlarmaButton: Button = detenerAlarmaCard.findViewById(R.id.alarm_action_button)

        // Setting onClick listeners
        crearAlarmaButton.setOnClickListener {
            val crearAlarma = Intent(this, CrearAlarmaActivity::class.java)
            startActivity(crearAlarma)
        }

        personalizarAlarmaButton.setOnClickListener {
            val personalizarAlarma = Intent(this, Personalizar::class.java)
            startActivity(personalizarAlarma)
        }

        editarAlarmaButton.setOnClickListener {
            // Logic for editing alarm
        }

        detenerAlarmaButton.setOnClickListener {
            // Logic for stopping alarm
        }
        getDeternerButton.setOnClickListener {
            val detenerAlarma = Intent(this, Detener::class.java)
            startActivity(detenerAlarma)
        }
    }
}
