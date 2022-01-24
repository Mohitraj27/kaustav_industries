package com.android.registrationformapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupSpinner()
        setupButton()
        Login()
    }
 private fun Login(){
     Log_in_page.setOnClickListener{
         val intent=Intent(this@MainActivity,MainActivity2::class.java)
         startActivity(intent)
     }
 }
    private fun setupButton() {
        button_create_account.setOnClickListener{
            createAccount()
        }

    }

    private fun setupSpinner() {
        val titles = arrayOf("Miss","Mrs","Mr","Dr","Prof")
        val titleAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,titles)
       spinner_title.adapter = titleAdapter
    }


    private fun createAccount(){
        val user = User(
            spinner_title.selectedItem as String,
            edit_text_first_name.text.toString(),
            edit_text_last_name.text.toString(),
            edit_text_email.text.toString(),
            edit_text_phone.text.toString(),
            edit_text_password.text.toString(),

        )

        val intent = Intent(this,SummaryActivity::class.java)
        intent.putExtra("User",user)
        startActivity(intent)
    }
}
