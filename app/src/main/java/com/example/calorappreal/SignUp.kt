package com.example.calorappreal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        supportActionBar?.hide()
        setContentView(R.layout.activity_sign_up)
        val signUpButton = findViewById<Button>(R.id.signUpNextButton)
        signUpButton.setOnClickListener(){
            val intent = Intent(this, ConditionPage::class.java)
            startActivity(intent)
        }
    }
}