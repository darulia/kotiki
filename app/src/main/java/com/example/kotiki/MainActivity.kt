package com.example.kotiki

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickGoOne(view: View) {
        val intent = Intent(this, kotiki1::class.java)
        startActivity(intent)
    }

    fun main() {

        val alice: Person = Person("Alice", 24)
        println(alice.toString())
    }

    class Person(val name: String, val age: Int)

    fun onClickGoTwo(view: View) {
        val intent = Intent(this, kotiki2::class.java)
        startActivity(intent)
    }

    fun onClickGoThree(view: View) {
        val intent = Intent(this, kotiki3::class.java)
        startActivity(intent)
    }

}