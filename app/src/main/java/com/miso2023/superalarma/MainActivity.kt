package com.miso2023.superalarma

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.miso2023.superalarma.Personalizar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getPersonalizarButton: Button = findViewById(R.id.personalizar_button)
        val getDeternerButton: Button = findViewById(R.id.detener_buton)

        getPersonalizarButton.setOnClickListener {
            val personalizarAlarma = Intent(this, Personalizar::class.java)
            startActivity(personalizarAlarma)
        }
        getDeternerButton.setOnClickListener {
            val detenerAlarma = Intent(this, Detener::class.java)
            startActivity(detenerAlarma)
        }
    }
}