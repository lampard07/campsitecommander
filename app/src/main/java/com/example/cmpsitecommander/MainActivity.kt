package com.example.cmpsitecommander

// These lines import tools we need to build the screen
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

// This tells Android that SplashActivity is a screen in our app
class SplashActivity : AppCompatActivity() {

    // This function runs automatically when the screen opens
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This line connects this Kotlin file to the activity_splash.xml layout
        setContentView(R.layout.activity_splash)

        // This creates a 3 second timer (3000 milliseconds)
        Handler(Looper.getMainLooper()).postDelayed({
            // After 3 seconds, go to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) // This starts the MainActivity screen
            finish() // This closes the splash screen so user cant go back to it
        }, 3000) // 3000 =