package com.example.widget

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.widget.databinding.ActivityMainBinding

//Membuat variabel binding
    private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Memanggil layout dengan binding.root
        setContentView(binding.root)

        //Explicit Intent
        binding.btnIntentWidget.setOnClickListener {
            val intent = Intent(this,Widget::class.java)
            startActivity(intent)
        }

        binding.btnIntentExplicit.setOnClickListener {
            val intent = Intent(this,ImplicitIntent::class.java)
            startActivity(intent)
        }

    }
}