package com.android.registrationformapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_collect_my_waste.*

class Collect_My_Waste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collect_my_waste)
        metallicWaste()
        ElectronicWaste()
        Paper_Waste()
        Glass_Waste()
        Other_Types_Of_Waste()
    }

    private fun Other_Types_Of_Waste() {
        Other_Types_of_Waste.setOnClickListener {
            val intent = Intent(this@Collect_My_Waste, Metallic_Waste::class.java)
            startActivity(intent)
        }
    }

    private fun Paper_Waste() {

        paper_waste_button.setOnClickListener {
            val intent = Intent(this@Collect_My_Waste, Metallic_Waste::class.java)
            startActivity(intent)
        }
    }

    private fun metallicWaste() {
        metallic_waste.setOnClickListener {
            val intent = Intent(this@Collect_My_Waste, Metallic_Waste::class.java)
            startActivity(intent)
        }
    }

    private fun ElectronicWaste() {
        electronic_waste.setOnClickListener {
            val intent = Intent(this@Collect_My_Waste, Metallic_Waste::class.java)
            startActivity(intent)
        }
    }

    fun Glass_Waste() {
        Glass_waste_button.setOnClickListener {
            val intent = Intent(this@Collect_My_Waste, Metallic_Waste::class.java).apply {
                startActivity(this)
            }
        }

    }
}


