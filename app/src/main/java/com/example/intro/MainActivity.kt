package com.example.intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        busBtn.setOnClickListener {
            //  counter = counter + 1
            counter++
            taxiBtn.text = counter.toString()

        }
    }
}