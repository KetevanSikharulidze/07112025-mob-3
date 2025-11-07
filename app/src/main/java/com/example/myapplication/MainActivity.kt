package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.AnotherLayoutBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : AnotherLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AnotherLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        function()
//
//        binding.apply {
//
//            NewID
//
//
//        }

    }

//    fun anotherFunction() = with(binding){
//        NewID.setOnClickListener {
//
//        }
//    }


    private fun function() = with(binding){

        minusBtn.setOnClickListener {

            var amount = amountTV.text.toString().toInt()

            amount--

            amountTV.text = amount.toString()
        }

        nextBtn.setOnClickListener {

            val price = priceTV.text.toString().toInt()

            val intent = Intent(this@MainActivity, MainActivity2::class.java)

            intent.putExtra("PRICE",price)

            startActivity(intent)

        }
    }
}