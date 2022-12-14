package com.example.calorappreal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        val SignUpScreenButton = findViewById<Button>(R.id.SignUpButton)
        SignUpScreenButton.setOnClickListener(){
            val Intent = Intent(this, SignUp::class.java)
            startActivity(Intent)
        }
    }
}