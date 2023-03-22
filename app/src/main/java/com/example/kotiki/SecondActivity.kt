package com.example.kotiki

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotiki.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat1 = intent.getParcelableExtra<Kotik>(MainActivity.CAT_KEY1)
        val cat2 = intent.getParcelableExtra<Kotik>(MainActivity.CAT_KEY2)
        val cat3 = intent.getParcelableExtra<Kotik>(MainActivity.CAT_KEY3)

        cat1?.let {
            val text =
                "Ім'я: ${cat1.name}," + "\n" + "Власник: ${cat1.owner}," + "\n" + "Опис: ${cat1.text}"
            binding.textView9.text = text

        }

        cat2?.let {
            val text =
                "Ім'я: ${cat2.name}," + "\n" + "Власник: ${cat2.owner}," + "\n" + "Опис: ${cat2.text}"
            binding.textView9.text = text

        }

        cat3?.let {
            val text =
                "Ім'я: ${cat3.name}," + "\n" + "Власник: ${cat3.owner}," + "\n" + "Опис: ${cat3.text}"
            binding.textView9.text = text

        }


    }

    fun onClickBack(view: View) {
        finish()
    }
}