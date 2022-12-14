package com.example.calorappreal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import kotlinx.coroutines.selects.select

class bodyMeasurementPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_body_measurement_page)
        val nextButton = findViewById<Button>(R.id.bodyMeasurementNextButton);
        nextButton.setOnClickListener(){
            val intent = Intent(this, selectGenderPage::class.java );
            startActivity(intent)
        }

    }
}