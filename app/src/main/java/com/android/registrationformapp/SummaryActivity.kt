package com.android.registrationformapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import kotlinx.android.synthetic.main.activity_summary.*

class SummaryActivity : AppCompatActivity() {

    lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)
        CollectMyWaste()
        retrieveUser()
        displayUser()
        setupClickListener()

    }
private fun CollectMyWaste()
{
    collect_My_waste.setOnClickListener{
        val intent =Intent(this@SummaryActivity,Waste::class.java)
            startActivity(intent)
    }
}
    private fun setupClickListener() {
    text_view_email_address.setOnClickListener{
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:${user.email}")
        startActivity(intent)
    }
        text_view_phone.setOnClickListener{
         val intent = Intent(Intent.ACTION_DIAL)
            intent.data =Uri.parse("tel:${user.phone}")
            startActivity(intent)
        }
    }


    private fun displayUser() {
        text_view_user_full_name.text = user.getFullName()
text_view_email_address.text=user.email
        text_view_phone.text =user.phone
    }

    private fun retrieveUser() {
        user = intent.getSerializableExtra("User") as User

    }

}