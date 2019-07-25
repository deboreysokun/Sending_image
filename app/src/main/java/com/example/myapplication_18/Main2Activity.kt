package com.example.myapplication_18

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var imageString = intent.getStringExtra("image")
        if(!imageString.equals("null"))
        {
            var photo = Uri.parse(imageString)
            photo2.setImageURI(photo)
        }

        back.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
    override fun onStart() {
        Toast.makeText(this,"You uploaded image successfully...",Toast.LENGTH_SHORT).show()
        super.onStart()
    }
}
