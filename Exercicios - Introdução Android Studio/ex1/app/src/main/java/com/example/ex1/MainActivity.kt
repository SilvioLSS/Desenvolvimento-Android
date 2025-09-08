package com.example.ex1

import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val palavra = findViewById<EditText>(R.id.palavra)
        val btnMaiusculas = findViewById<Button>(R.id.btnMaiusculas)
        val btnMinusculas = findViewById<Button>(R.id.btnMinusculas)
        val resultado = findViewById<TextView>(R.id.resultado)

        btnMaiusculas.setOnClickListener{
            resultado.text = palavra.text.toString().uppercase()
        }

        btnMinusculas.setOnClickListener{
            resultado.text = palavra.text.toString().lowercase()
        }
    }
}