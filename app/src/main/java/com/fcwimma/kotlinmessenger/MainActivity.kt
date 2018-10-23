package com.fcwimma.kotlinmessenger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = email_edittext_register.text.toString()
        val password = password_edittext_register.text.toString()

        val TAG = "MyActivity"
        val MSG = "Email is: "
        val PSWD = "Password"

        Log.d(TAG, MSG)
        Log.d(TAG, PSWD + email)



    }
}
