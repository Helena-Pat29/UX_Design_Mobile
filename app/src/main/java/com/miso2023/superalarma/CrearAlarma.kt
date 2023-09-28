package com.miso2023.superalarma

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class CrearAlarmaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crear_alarma)

        // Binding views
        val daySpinner: Spinner = findViewById(R.id.daySpinner)
        val monthSpinner: Spinner = findViewById(R.id.monthSpinner)
        val yearSpinner: Spinner = findViewById(R.id.yearSpinner)
        val hourSpinner: Spinner = findViewById(R.id.hourSpinner)
        val minuteSpinner: Spinner = findViewById(R.id.minuteSpinner)
        val amPmSpinner: Spinner = findViewById(R.id.amPmSpinner)

        // Days Spinner
        val days = (1..31).toList()
        val daysAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, days)
        daySpinner.adapter = daysAdapter

        // Months Spinner
        val months = listOf("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre")
        val monthsAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, months)
        monthSpinner.adapter = monthsAdapter

        // Years Spinner
        val currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)
        val years = (currentYear downTo currentYear - 20).toList()
        val yearsAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, years)
        yearSpinner.adapter = yearsAdapter

        // Hour Spinner
        val hours = (1..12).toList()
        val hoursAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, hours)
        hourSpinner.adapter = hoursAdapter

        // Minute Spinner
        val minutes = (0..59).toList()
        val minutesAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, minutes)
        minuteSpinner.adapter = minutesAdapter

        // AM/PM Spinner
        val amPm = listOf("AM", "PM")
        val amPmAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, amPm)
        amPmSpinner.adapter = amPmAdapter

        // Handle Spinner Selections
        daySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedDay = parent.getItemAtPosition(position) as Int
                // Handle the selection
            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }
        val cancelButton: Button = findViewById(R.id.cancelButton)

        // Setting a click listener on the button
        cancelButton.setOnClickListener {
            // Create an intent to navigate to the MainActivity
            val intent = Intent(this@CrearAlarmaActivity, MainActivity::class.java)

            // Start the MainActivity
            startActivity(intent)

            finish()
        }

        val personalizeButton: Button = findViewById(R.id.customizeButton)

        // Setting a click listener on the button
        personalizeButton.setOnClickListener {
            // Create an intent to navigate to the Personalizar
            val intent = Intent(this@CrearAlarmaActivity, Personalizar::class.java)

            // Start the Personalizar
            startActivity(intent)
        }
    }
}