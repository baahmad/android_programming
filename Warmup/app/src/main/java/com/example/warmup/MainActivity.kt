package com.example.warmup

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orientation = getResources().getConfiguration().orientation;  // get orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {         // check orientation
            // In landscape
        } else {
            // In portrait
            val rollButton: Button = findViewById(R.id.roll_button)
            rollButton.text = getString(R.string.button)
            rollButton.setOnClickListener {
                Toast.makeText(this, R.string.toast, Toast.LENGTH_LONG).show()
            }

        }
    }
}