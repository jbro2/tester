package com.example.owner.carsearcher

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage (view: View) { //this is a test
        // Create an Intent to start the second activity
        val testIntent = Intent(this, postView::class.java)

        // Start the new activity.
        startActivity(testIntent)
    }

}
