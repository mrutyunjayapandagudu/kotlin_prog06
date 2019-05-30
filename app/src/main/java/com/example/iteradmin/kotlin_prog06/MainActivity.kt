package com.example.iteradmin.kotlin_prog06

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = arrayOf("aamin","anamika","ajay","hari","adrash","rupesh","harsh","gopal")
        val search=findViewById<AutoCompleteTextView>(R.id.auto)
        val adp=ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,data)
        search.setAdapter(adp)
        search.threshold=1
        search.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,position.toString(), Toast.LENGTH_LONG).show()
            Toast.makeText(this,parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show()
        }
    }
}
