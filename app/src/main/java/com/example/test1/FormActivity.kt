package com.example.test1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FormActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_form)

        editText= findViewById(R.id.EditName)
        button= findViewById(R.id.buttonSubmit)
        textView=findViewById(R.id.Display)

        button.setOnClickListener {
            val data: String = editText.text.toString()
            textView.text=data
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}