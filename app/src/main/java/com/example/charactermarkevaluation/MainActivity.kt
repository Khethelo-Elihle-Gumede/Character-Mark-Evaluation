package com.example.charactermarkevaluation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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
import com.example.charactermarkevaluation.ui.theme.CharacterMarkEvaluationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val gradeInput = findViewById<EditText>(R.id.editGrade)
        val resultsText = findViewById<TextView>(R.id.textResults)
        val checkButton = findViewById<Button>(R.id.btnCheck)
        val resetButton = findViewById<Button>(R.id.btnReset)

        checkButton.setOnClickListener {
            val grade = gradeInput.text.toString().uppercase()

            if( grade == "A"){
                resultsText.text = "Excellent"

            }
            else if( grade == "B"){
                resultsText.text = "Very Good"
            }
            else if( grade == "C"){
                resultsText.text = "Good"

            }
            else if ( grade == "D"){
                resultsText.text = "Pass"
            }
            else if ( grade == "E"){
                resultsText.text = "Fail"
            }
            else if ( grade == "F"){
                resultsText.text = "Invaild Input"
            }
        }
        resetButton.setOnClickListener {
            gradeInput.text.clear()
            resultsText.text = "Results will appear here"
        }

        }
    }
