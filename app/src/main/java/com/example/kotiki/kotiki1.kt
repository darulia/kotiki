package com.example.kotiki

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class kotiki1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotiki1)
    }

    fun onClickBack(view: View) {
        finish()
    }
}