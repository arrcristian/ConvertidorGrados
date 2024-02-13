package mx.edu.itson.potros.examen

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etCelsius: EditText
    private lateinit var etFahrenheit: EditText
    private lateinit var btnCelsiusToFahrenheit: TextView
    private lateinit var btnFahrenheitToCelsius: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etCelsius = findViewById(R.id.etC)
        etFahrenheit = findViewById(R.id.etF)
        btnCelsiusToFahrenheit = findViewById(R.id.btnGC)
        btnFahrenheitToCelsius = findViewById(R.id.btnGF)

        btnCelsiusToFahrenheit.setOnClickListener {
            val celsius = etCelsius.text.toString().toDouble()
            val fahrenheit = (celsius * 1.8) + 32
            etFahrenheit.setText(fahrenheit.toString())
        }

        btnFahrenheitToCelsius.setOnClickListener {
            val fahrenheit = etFahrenheit.text.toString().toDouble()
            val celsius = (fahrenheit - 32) / 1.8
            etCelsius.setText(celsius.toString())
        }
    }
}