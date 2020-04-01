package com.anushka.bindingdemo1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.anushka.bindingdemo1.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil as DataBindingUtil

class MainActivity : AppCompatActivity() {

     lateinit var databinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)i
              databinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
       // val button = findViewById<Button>(R.id.submit_button)
        databinding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        databinding.apply {
            val message = "Hello! "+ nameEditText.text
            greetingTextView.text = message
        }


    }
}
