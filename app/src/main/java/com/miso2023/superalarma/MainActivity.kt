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

        getPersonalizarButton.setOnClickListener {
            val personalizarAlarma = Intent(this, Personalizar::class.java)
            startActivity(personalizarAlarma)
        }
    }
}