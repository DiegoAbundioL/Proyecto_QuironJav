package com.example.quironjav

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var btnShowName: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowName = findViewById(R.id.btnShowName)
        btnShowName.setOnClickListener {
            Log.d("Garage", "Click en el boton aceptar")
        }
        val video = findViewById<VideoView>(R.id.video)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/raw/foca")
        video.setVideoURI(uri)
        video.requestFocus()
        video.resume()
        video.start()
    }
}
