package com.android.registrationformapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.button_create_account
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        createAccount()
        LogInButton()
    }
    private fun LogInButton()
    {
        log_in_button.setOnClickListener{
            val intent=Intent(this@MainActivity2,SummaryActivity::class.java)
            startActivity(intent)
        }
    }
private fun createAccount()
{
    button_create_account.setOnClickListener{
        val intent= Intent(this@MainActivity2,MainActivity::class.java)
        startActivity(intent)
    }
}
}
