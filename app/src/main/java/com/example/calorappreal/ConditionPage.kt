package com.example.calorappreal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class ConditionPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_condition_page)
        val nextButton = findViewById<Button>(R.id.AboutConditionNextButton);
        nextButton.setOnClickListener(){
            val intent = Intent(this, bodyMeasurementPage::class.java)
            startActivity(intent)
        }

    }
}