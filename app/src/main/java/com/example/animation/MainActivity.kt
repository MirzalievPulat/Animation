package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image = findViewById<ImageView>(R.id.imageView)
        var bounceButton = findViewById<Button>(R.id.bounce_button)
        var sequentialButton =findViewById<Button>(R.id.sequential_button)
        var togetherButton = findViewById<Button>(R.id.together_button)

        bounceButton.setOnClickListener {
            image.startAnimation(AnimationUtils.loadAnimation(this,R.anim.bounce))
        }

        sequentialButton.setOnClickListener {
            image.startAnimation(AnimationUtils.loadAnimation(this,R.anim.sequential))
        }

        togetherButton.setOnClickListener {
            image.startAnimation(AnimationUtils.loadAnimation(this,R.anim.together))
        }
    }
}