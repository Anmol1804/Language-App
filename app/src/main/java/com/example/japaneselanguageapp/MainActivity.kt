package com.example.japaneselanguageapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun sayTheColor(view: View){
        // Casting view as Button
        val clickedBtn : Button = view as Button

        // media player to sound
        val mediaPLayer : MediaPlayer = MediaPlayer.create(
            this,
            resources.getIdentifier(clickedBtn.tag.toString(),"raw", packageName)
        )

        mediaPLayer.start()
    }
}