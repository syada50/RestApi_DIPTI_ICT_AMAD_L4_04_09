package com.example.restapi_dipti_ict_amad_l4_04_09

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity_DIPTI_ICT_AMAD_L4_04_09 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dipti_ict_amad_l4_04_09)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@MainActivity_DIPTI_ICT_AMAD_L4_04_09,ProductActivity_DIPTI_ICT_AMAD_L4_04_09::class.java))
            finish()
        },3000)
    }
}