package com.example.dynamicallyaddingtorows

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    fun addRow(){
        val tmp = TextView(this)
        tmp.text = editText.text.toString() + " | " + editText2.text.toString();
        tableRow.addView(tmp)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { addRow() };
    }
}
