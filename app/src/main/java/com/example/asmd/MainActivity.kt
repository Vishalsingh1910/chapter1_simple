package com.example.asmd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.webkit.WebView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val webView = WebView(this)
//
//        webView.settings.javaScriptEnabled = true
//        setContentView(webView)
//        webView.loadUrl("https://www.google.com")
        findViewById<Button>(R.id.enter_button)?.setOnClickListener {
            val greetingDisplay =
                findViewById<TextView>(R.id.greeting_display)

            val firstName = findViewById<TextInputEditText>(R.id.first_name)?.text.toString().trim()
            val lastname = findViewById<TextInputEditText>(R.id.last_name)?.text.toString().trim()

            if (firstName.isNotEmpty() && lastname.isNotEmpty()) {
                val nameToDisplay = firstName.plus(" ").plus(lastname)
                //Use Kotlin's string templates feature to display the name
                greetingDisplay?.text =
                    " ${getString(R.string.welcome_to_the_app)} "
                //${ nameToDisplay }!"
            } else {
                Toast.makeText(
                    this, getString(R.string.please_enter_your_name),
                    Toast.LENGTH_LONG
                ).apply {
                    setGravity(Gravity.CENTER, 0, 0)
                    show()
                }
            }
        }
    }
}