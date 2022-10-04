package com.amaurypm.clicks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    private lateinit var tvSaludo: TextView
    private lateinit var btnSaludar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        tvSaludo = findViewById(R.id.tvSaludo)
        btnSaludar = findViewById(R.id.btnSaludar)
    }

    fun clicks(view: View) {
        when(view.id){

            R.id.btnSaludar -> {
                tvSaludo.text = "¿Cómo están? ${getString(R.string.happy_face)}"
                tvSaludo.textSize = 40F
            }

            R.id.tvSaludo -> {
                tvSaludo.text = "Amaury"
            }

        }
    }


}