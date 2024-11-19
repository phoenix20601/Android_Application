package com.example.test1

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var radioImage: RadioButton
    lateinit var radioImagee: RadioButton
    lateinit var radioImageee: RadioButton
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        radioImage= findViewById(R.id.radioImage)
        radioImagee= findViewById(R.id.radioImagee)
        radioImageee= findViewById(R.id.radioImageee)
        imageView=findViewById(R.id.imageView5)

        radioImage.setOnClickListener {
            imageView.setImageResource(R.drawable.image)
        }
        radioImagee.setOnClickListener {
            imageView.setImageResource(R.drawable.imagee)
        }
        radioImageee.setOnClickListener {
            imageView.setImageResource(R.drawable.imageee)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}