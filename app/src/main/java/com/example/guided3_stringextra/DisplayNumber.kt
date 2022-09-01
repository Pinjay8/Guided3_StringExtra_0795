package com.example.guided3_stringextra

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.TextView

class DisplayNumber: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        val intent: Intent = intent
        val message: String? = intent.getStringExtra("inputanAngka")

        val textView = TextView(this)
        textView.setTextSize(40F)
        textView.setText("Angka yang anda inputkan adalah " + message)

        setContentView(textView)
    }
}