package com.example.week05day03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //                  01234
    private val name = "Ahmad"
    private val number = 100.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        sum()
//        printLastChar()
//        printFirstChar()
//        compareNum()
//
//        sumTwoNumbers(10,20)
//        sumTwoNumbersDefault(20,30)
//        multiplicationDefault()
//        sumFiveNumbers(1,2,3,4,5)

        name.printThird()
        number.plusTen()
    }

    private fun sum(){
        val num1 = 10
        val num2 = 5
        val result = num1+num2
        Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
    }
    private fun printLastChar(){
        val name = "Ahmad"
        Toast.makeText(this,name.last().toString(),Toast.LENGTH_SHORT).show()
    }
    private fun printFirstChar(){
        val name = "Ahmad"
        Toast.makeText(this,name.first().toString(),Toast.LENGTH_SHORT).show()
    }
    private fun compareNum(){
        val num1 = 5
        val num2 = 5

        when {
            num1 > num2 -> {
                Toast.makeText(this,"num1 is greater than num2",Toast.LENGTH_SHORT).show()
            }
            num2 > num1 -> {
                Toast.makeText(this,"num2 is greater than num1",Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(this,"num1 equals num2",Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun sumTwoNumbers(num1:Int,num2:Int){
        val result = num1+num2
        Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
    }
    private fun sumTwoNumbersDefault(num1:Int = 10,num2: Int = 20){
        val result = num1 + num2
        Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
    }
    private fun multiplicationDefault(num1:Int = 4,num2: Int = 5){
        val result = num1 * num2
        Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
    }
    private fun sumFiveNumbers(vararg numbers:Int){
        var sum = 0
        for(num in numbers){
            sum = sum + num
        }
        Toast.makeText(this,sum.toString(),Toast.LENGTH_SHORT).show()
    }

    //          Class     Fun Name
    private fun String.printThird(){
        val thirdChar = this[2]
        Toast.makeText(this@MainActivity,thirdChar.toString(),Toast.LENGTH_SHORT).show()
    }
    private fun Double.plusTen(){
        val result = this + 10.0
        Toast.makeText(this@MainActivity,result.toString(),Toast.LENGTH_SHORT).show()
    }
}