package com.github.mdssjc.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice1 = Dice(6)
        val dice2 = Dice(6)

        val dice1Roll = dice1.roll()
        val dice2Roll = dice2.roll()

        val resultLeftTextView: TextView = findViewById(R.id.textView)
        val resultRigthTextView: TextView = findViewById(R.id.textView2)

        resultLeftTextView.text = dice1Roll.toString()
        resultRigthTextView.text = dice2Roll.toString()
    }
}