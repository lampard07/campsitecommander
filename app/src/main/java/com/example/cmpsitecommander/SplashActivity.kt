package com.example.cmpsitecommander

// Importing the tools we need
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

// This class controls the Splash Screen
class SplashActivity : AppCompatActivity() {

    // This runs automatically when the screen opens
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Connect this file to the splash screen layout
        setContentView(R.layout.activity_splash)

        // Wait 4 seconds then move to the Main Screen
        Handler(Looper.getMainLooper()).postDelayed({
            // Create an intent to navigate to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) // Open MainActivity
            finish() // Close SplashActivity so user cant go back
        }, 4000) // 4000 milliseconds = 4 seconds
    }
}