package com.android.registrationformapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_metallic_waste.*

class Metallic_Waste : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metallic_waste)
        GotouserProfile()
    }
private fun GotouserProfile()
{
    go_to_user_profile_button.setOnClickListener{
        val intent =Intent(this@Metallic_Waste,Collect_My_Waste::class.java)
        startActivity(intent)
    }
}
}