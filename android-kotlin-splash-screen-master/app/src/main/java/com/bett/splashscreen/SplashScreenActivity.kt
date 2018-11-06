package com.bett.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager

class SplashScreenActivity : AppCompatActivity() {


    // En esta activity se encuentra el codigo para nuestra primera pantalla de presentación
    // Mas conocida como pantalla de carga

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)


        setContentView(R.layout.activity_splashscreen)

        Handler().postDelayed({
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }, 2000)
    }
}
