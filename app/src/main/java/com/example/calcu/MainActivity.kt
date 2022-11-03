package com.example.calcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var  resultTextView: TextView
    private var operand= 0.0
    private var operation=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)

    }
    fun numberClick(clickedView: View){
        if (clickedView is TextView) {

            var text = resultTextView.text.toString()
            val number= clickedView.text.toString()
            if(text == "0"){
                text=""
            }

            val result=text + number
            resultTextView.text=result
        }
    }


    fun operationClick(clickedView: View){
        if(clickedView is TextView){
            operand=resultTextView.text.toString().toDouble()
            operation=clickedView.text.toString()
            resultTextView.text=""
        }
    }

    fun equalsClick(clickedView: View){
        val secondoperand=resultTextView.text.toString().toDouble()
        when(operation){
            "+" -> resultTextView.text=(operand + secondoperand).toString()
            "-" -> resultTextView.text=(operand - secondoperand).toString()
            "*" -> resultTextView.text=(operand * secondoperand).toString()
            "/" -> resultTextView.text=(operand / secondoperand).toString()
        }
    }

    fun clearClicked(clickedView: View){
        operand =0.0
        val ragaca ="0"
        resultTextView.text=ragaca
    }
    fun DelClicked(clickedView: View){

        val სიგრძე =resultTextView.length()
        if (სიგრძე > 0){
            resultTextView.text=resultTextView.text.subSequence(0,სიგრძე - 1)
        }

    }
    fun  pointClicked(clickedView: View){
        if (clickedView is TextView){
            var ტექსტი = resultTextView.text.toString()
            val number =clickedView.text.toString()
        }

    }
}