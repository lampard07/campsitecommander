package com.example.cmpsitecommander

// Importing the tools we need
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// This class controls the Detailed View Screen
class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Connect this file to the activity_detail layout
        setContentView(R.layout.activity_detail)

        // Same parallel arrays with our gear data
        val itemNames = arrayOf("Tent", "Marshmallows", "Flashlight", "Sleeping Bag", "Water Bottle")
        val categories = arrayOf("Shelter", "Food", "Safety", "Shelter", "Food)
        val quantities = arrayOf(1, 3, 2, 2, 4)
        val comments = arrayOf("4-person waterproof", "For Smores Mega size", "Check batteries AA", "Warm rated", "1 litre each")

        // Find the TextView where we will display the gear list
        val tvGearList = findViewById<TextView>(R.id.tvGearList)

        // Build the gear list text using a loop
        var gearList = ""
        for (i in itemNames.indices) {
            // For each item add a line with all its details
            gearList += "Item: ${itemNames[i]}\n"
            gearList += "Category: ${categories[i]}\n"
            gearList += "Quantity: ${quantities[i]}\n"
            gearList += "Comments: ${comments[i]}\n"
            gearList += "--------------------\n"
        }
        // Display the full gear list on screen
        tvGearList.text = gearList

        // Find the Back to Base button
        val btnBack = findViewById<Button>(R.id.btnBack)
        // When clicked go back to the Main Screen
        btnBack.setOnClickListener {
            finish() // This closes DetailActivity and returns to MainActivity
        }
    }
}