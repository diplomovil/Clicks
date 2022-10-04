package com.amaurypm.clicks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvSaludo: TextView
    private lateinit var btnSaludar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvSaludo = findViewById(R.id.tvSaludo)
        btnSaludar = findViewById(R.id.btnSaludar)

        btnSaludar.setOnClickListener(this)
        tvSaludo.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnSaludar -> {
                tvSaludo.text = "¿Cómo están?"
            }

            R.id.tvSaludo -> {
                tvSaludo.text = "Amaury"
            }

            else -> {

            }
        }
    }
}