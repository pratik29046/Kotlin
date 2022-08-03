package com.rdx.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = findViewById(R.id.text1) as TextView

        /*a.setOnClickListener {
            intent=Intent(this,MainActivity2::class.java);
            startActivity(intent);
        }*/

        /*a.setOnClickListener{
            Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();
        }*/

        a.setOnClickListener {
            val pop = AlertDialog.Builder(this);
            pop.setTitle("Alert");
            pop.setMessage("hello my dear friend how are you");

            pop.setPositiveButton("yes") { dialog, which ->
                Toast.makeText(this, "yes", Toast.LENGTH_LONG).show();
            }

            pop.setNegativeButton("No") { dialog, which ->
                var i = Intent(this, MainActivity2::class.java);
                startActivity(i);
            }

            pop.show();


        }


    }
}