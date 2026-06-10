package com.example.cmpsitecommander

// Importing the tools we need
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private val appcompat: Any

// This class controls the Main Screen
class MainActivity : AppCompatActivity() {

    // Parallel arrays to store our gear data
    val itemNames = arrayOf("Tent", "Marshmallows", "Flashlight", "Sleeping Bag", "Water Bottle")
    val categories = arrayOf("Shelter", "Food", "Safety", "Shelter", "Food")
    val quantities = arrayOf(1, 3, 2, 2, 4)
    val comments = arrayOf("4-person waterproof", "For Smores Mega size", "Check batteries AA", "Warm rated", "1 litre each")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Connect this file to the activity_main layout
        setContentView(R.layout.activity_main)

        // Find the total items TextView on the screen
        val tvTotalItems = findViewById<TextView>(R.id.tvTotalItems)

        // Use a loop to count the total number of items
        var total = 0
        for (qty in quantities) {
            // Add each quantity to the total
            total += qty
        }
        // Display the total on screen
        tvTotalItems.text = "Total Items Packed: $total"

        // Find the Add Gear button
        val btnAddGear = findViewById<Button>(R.id.btnAddGear)
        // When Add Gear is clicked, show a message for now
        btnAddGear.setOnClickListener {
            android.widget.Toast.makeText(this, "Add Gear coming soon!", android.widget.Toast.LENGTH_SHORT).show()
        }

        // Find the View Gear List button
        val btnViewGear = findViewById<Button>(R.id.btnViewGear)
        // When View Gear is clicked, go to DetailActivity
        btnViewGear.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent) // Open the detail screen
        }
    }
}