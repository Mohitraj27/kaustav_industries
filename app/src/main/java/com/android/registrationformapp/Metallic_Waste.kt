package com.android.registrationformapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_metallic_waste.*

class Metallic_Waste : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metallic_waste)
        GotouserProfile()
        Submit_waste();


    }

    private fun Submit_waste() {
        TODO("Not yet implemented")
    }

    private fun Submit_waste(button_submit_waste_details: Any)
    {

        button_submit_waste_details.setOnClickListener{
            Toast.makeText(this,"Your Waste Details has been submitted",Toast.LENGTH_SHORT).show();
        }
    }


private fun GotouserProfile()
{
    go_to_user_profile_button.setOnClickListener{
        val intent =Intent(this@Metallic_Waste,Collect_My_Waste::class.java)
        startActivity(intent)
    }
}
}

private fun Any.setOnClickListener(function: () -> Unit) {

}
