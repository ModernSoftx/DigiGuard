package com.example.digiguard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.biometric.BiometricManager

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val biometricManager =  BiometricManager.from(this)
        if(biometricManager.canAuthenticate()  ==  BiometricManager.BIOMETRIC_SUCCESS){
            // you can authenticate with biometrics

            Toast.makeText(this, "BiometricManager available", Toast.LENGTH_SHORT).show()

        }
    }
}