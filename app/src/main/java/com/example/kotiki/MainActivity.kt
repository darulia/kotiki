package com.example.kotiki

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotiki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat1 = Kotik(
            "Мойва",
            "Я",
            "Це моя кішка, яку звуть Мойва. Зараз вона виглядає трошки інакше, адже це фото її юності. Вона відзначалась своїми величезними вухами."
        )
        val cat2 = Kotik("Моля", "Сестра", "Це кицюня моєї сестри.")
        val cat3 = Kotik(
            "Степан",
            "Мама",
            "Цього парубка звуть Степан.Він синочок Мойви, що дуже навіть помітно."
        )



        binding.button.setOnClickListener {
            val intent1 = Intent(this, SecondActivity::class.java)
            intent1.putExtra(CAT_KEY1, cat1)
            startActivity(intent1)
        }

        binding.button2.setOnClickListener {
            val intent2 = Intent(this, SecondActivity::class.java)
            intent2.putExtra(CAT_KEY2, cat2)
            startActivity(intent2)
        }

        binding.button3.setOnClickListener {
            val intent3 = Intent(this, SecondActivity::class.java)
            intent3.putExtra(CAT_KEY3, cat3)
            startActivity(intent3)
        }


//        cat3?.let {
//            val cat3Str = "${cat3.name}"
//            val cat3StrAge = "Age: ${cat3.age}"
//            binding.textView6.text = cat3StrAge
//            binding.textView5.text = cat3Str
//        }

//    }

//    fun onClickGoOne(view: View) {
//        val intent = Intent(this, SecondActivity::class.java)
//        startActivity(intent)
//    }
//
//
//    fun onClickGoTwo(view: View) {
//        val intent = Intent(this, SecondActivity::class.java)
//        startActivity(intent)
//    }
//
//
//    fun onClickGoThree(view: View) {
//        val intent = Intent(this, SecondActivity::class.java)
//        intent.putExtra(CAT_KEY3, cat3)
//        startActivity(intent)


    }


    companion object {
        val CAT_KEY1 = "cat1"
        val CAT_KEY2 = "cat2"
        val CAT_KEY3 = "cat3"

    }
}



