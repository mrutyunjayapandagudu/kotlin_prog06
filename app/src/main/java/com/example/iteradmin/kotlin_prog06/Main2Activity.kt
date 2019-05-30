package com.example.iteradmin.kotlin_prog06

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {
    val states = arrayOf("odisha", "andhra pradesh", "tamil nadu", "madhya pradesh", "jamu kashmir", "gujurat", "bihar")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val capital = arrayOf("bhubanswear", "vishakpatnam", "chennai", "bhopal", "srinagar", "gandhi nagar", "patna")
        val rajya = findViewById<AutoCompleteTextView>(R.id.auto)
        val rajdgani = findViewById<TextView>(R.id.text)
        val text = findViewById<TextView>(R.id.text)
        val adp = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, states)
        rajya.setAdapter(adp)
        rajya.threshold = 1
        rajya.setOnItemClickListener { parent, view, position, id ->
            val s1: String = parent.getItemAtPosition(position).toString()
            val c: Int = getCapital(s1)
             text.setText(capital[c])
        }
    }

    fun getCapital(state: String): Int {
        var i = 0
        for (s in states) {
            if (state == s) {
                return i
            }
            i++
        }
        return i
    }
}

