package com.example.foodsurvey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val responses = intArrayOf(2, 5, 5, 1, 3, 2, 3, 2, 4, 1)
        val frequency = IntArray(5) {0}
        for (response in responses) {
            frequency[response - 1]++
        }
        println("Quality | Frequency | Histogram")
        for (i in 1..5) {
            val histogram = "*".repeat(frequency[i - 1])
            println("$i | ${frequency[i - 1]} | $histogram")
        }
    }
}
