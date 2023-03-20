package com.example.kotiki

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class kotiki3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotiki3)
    }

    fun onClickBack(view: View) {
        finish()
    }
}