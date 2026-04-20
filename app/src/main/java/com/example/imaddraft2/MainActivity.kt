package com.example.imaddraft2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.imaddraft2.ui.theme.IMADDraft2Theme




class MainActivity : ComponentActivity() {
    //Simple arrays
    private val questions = arrayOf(
        "T20 cricket is the most popular format in the world",
        "Virat Kohli has 83 hundreds in all formats",
        "Ab de Villiars has a T20 hundred",
        "India is the most successful cricketing nation in history",
        "The Proteas won the World Test Championship in 2025"
    )

    private val answers = arrayOf(
        true, true, false, false, true
    )

    private var currentQuestion = 0
    private var score = 0
    private var feedbackList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showWelcomeScreen()
    }

    private fun showWelcomeScreen() {
        setContentView(R.layout.activity_welcome)
        val startButton = findViewById<Button>(R.id.btnStart)
        startButton.setOnClickListener {
            currentQuestion = 0
            score = 0
        }
    }
}


