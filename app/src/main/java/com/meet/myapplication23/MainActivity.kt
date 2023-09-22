package com.meet.myapplication23

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    var parent: LinearLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.some_file)


        initViews()
    }

    private fun initViews() {
        parent = findViewById(R.id.ll_parent_for_states);

        val b:Button = LayoutInflater.from(this).inflate(R.layout.button_resource, null) as Button
    }

    override fun onPause() {
        super.onPause()

        val b:Button = LayoutInflater.from(this).inflate(R.layout.button_resource, null) as Button

        b.setText("OnPause")
        parent?.addView(b)
    }
}