package com.example.test1

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class InteractionActivity : AppCompatActivity() {
    lateinit var btnSnack: Button
    lateinit var btnAlert: Button
    lateinit var btnToast: Button
    lateinit var main :ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interaction)

        main=findViewById(R.id.main)
        btnAlert=findViewById(R.id.btnAlert)
        btnSnack=findViewById(R.id.btnSnack)
        btnToast=findViewById(R.id.btnToast)

        btnToast.setOnClickListener{
            Toast.makeText(this@InteractionActivity, "Login Success",
                Toast.LENGTH_LONG).show()
        }
        btnSnack.setOnClickListener {
            Snackbar.make(main,"Invalid Login",Snackbar.LENGTH_LONG).setAction("close",{}).show()
        }
        btnAlert.setOnClickListener {
            val alert=AlertDialog.Builder(this@InteractionActivity)
            alert.setTitle("CONFIRMATION")
                .setMessage("Are you sure?")
                .setIcon(R.drawable.image)
                .setNegativeButton("NO",DialogInterface.OnClickListener
                { dialogInterface, i ->  dialogInterface.dismiss()})
                .setPositiveButton("YES",DialogInterface.OnClickListener
                { dialogInterface, i -> })
            alert.create().show()




        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}