package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    private var onScreen = StringBuilder("0")
    var lastDigitNumeric = true
    var lastDot = false
    var lastOperator = false
    var zeroAfterOperator = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvInput : TextView = findViewById(R.id.tvInput)
        tvInput.text = onScreen


        val AC : Button = findViewById(R.id.ACBtn)
        val back : Button = findViewById(R.id.backBtn)
        val add : Button = findViewById(R.id.addBtn)
        val subtract : Button = findViewById(R.id.subtractBtn)
        val multiply : Button = findViewById(R.id.multiplyBtn)
        val divide : Button = findViewById(R.id.divideBtn)
        val percent : Button = findViewById(R.id.percentBtn)
        val dot : Button = findViewById(R.id.dotBtn)
        val equal :Button = findViewById(R.id.equalBtn)

        val oneBtn : Button = findViewById(R.id.oneBtn)
        val twoBtn : Button = findViewById(R.id.twoBtn)
        val threeBtn : Button = findViewById(R.id.threeBtn)
        val fourBtn : Button = findViewById(R.id.fourBtn)
        val fiveBtn : Button = findViewById(R.id.fiveBtn)
        val sixBtn : Button = findViewById(R.id.sixBtn)
        val sevenBtn : Button = findViewById(R.id.sevenBtn)
        val eightBtn : Button = findViewById(R.id.eightBtn)
        val nineBtn : Button = findViewById(R.id.nineBtn)
        val zeroBtn : Button = findViewById(R.id.zeroBtn)
        val zerozeroBtn : Button = findViewById(R.id.zerozeroBtn)

        oneBtn.setOnClickListener {
            if(tvInput.text != "0" )
            onScreen.append("1")
            else {
                onScreen.clear()
                onScreen.append("1")
            }
            tvInput.text = onScreen
            lastDigitNumeric = true
            lastOperator = false
            zeroAfterOperator = false
        }

        twoBtn.setOnClickListener {
            if(tvInput.text != "0" )
                onScreen.append("2")
            else {
                onScreen.clear()
                onScreen.append("2")
            }
            tvInput.text = onScreen
            lastDigitNumeric = true
            lastOperator = false
            zeroAfterOperator = false
        }

        threeBtn.setOnClickListener {
            if(tvInput.text != "0" )
                onScreen.append("3")
            else {
                onScreen.clear()
                onScreen.append("3")
            }
            tvInput.text = onScreen
            lastDigitNumeric = true
            lastOperator = false
            zeroAfterOperator = false
        }


        fourBtn.setOnClickListener {
            if(tvInput.text != "0" )
                onScreen.append("4")
            else {
                onScreen.clear()
                onScreen.append("4")
            }
            tvInput.text = onScreen
            lastDigitNumeric = true
            lastOperator = false
            zeroAfterOperator = false
        }

        fiveBtn.setOnClickListener {
            if(tvInput.text != "0" )
                onScreen.append("5")
            else {
                onScreen.clear()
                onScreen.append("5")
            }
            tvInput.text = onScreen
            lastDigitNumeric = true
            lastOperator = false
            zeroAfterOperator = false
        }

        sixBtn.setOnClickListener {
            if(tvInput.text != "0" )
                onScreen.append("6")
            else {
                onScreen.clear()
                onScreen.append("6")
            }
            tvInput.text = onScreen
            lastDigitNumeric = true
            lastOperator = false
            zeroAfterOperator = false
        }

        sevenBtn.setOnClickListener {
            if(tvInput.text != "0" )
                onScreen.append("7")
            else {
                onScreen.clear()
                onScreen.append("7")
            }
            tvInput.text = onScreen
            lastDigitNumeric = true
            lastOperator = false
            zeroAfterOperator = false

        }

        eightBtn.setOnClickListener {
            if(tvInput.text != "0" )
                onScreen.append("8")
            else {
                onScreen.clear()
                onScreen.append("8")
            }
            tvInput.text = onScreen
            lastDigitNumeric = true
            lastOperator = false
            zeroAfterOperator = false
        }

        nineBtn.setOnClickListener {
            if(tvInput.text != "0" )
                onScreen.append("9")
            else {
                onScreen.clear()
                onScreen.append("9")
            }
            tvInput.text = onScreen
            lastDigitNumeric = true
            lastOperator = false
            zeroAfterOperator = false
        }

        zeroBtn.setOnClickListener {
            if(tvInput.text != "0" && !lastOperator) {
                onScreen.append("0")
                tvInput.text = onScreen
                lastDigitNumeric = true
                lastOperator = false
            }
            if (lastOperator && !zeroAfterOperator){
                onScreen.append("0")
                tvInput.text = onScreen
                zeroAfterOperator= true
                lastDigitNumeric = true
                lastOperator = false
            }

        }

        zerozeroBtn.setOnClickListener {
            if(tvInput.text != "0" && !lastOperator) {
                onScreen.append("00")
                tvInput.text = onScreen
                lastDigitNumeric = true
            }
            if (lastOperator && !zeroAfterOperator){
                onScreen.append("0")
                tvInput.text = onScreen
                zeroAfterOperator = true
                lastDigitNumeric = true
                lastOperator = false

            }
        }



        AC.setOnClickListener {
            onScreen.clear()
            onScreen.append("0")
            tvInput.text = onScreen
            lastDigitNumeric = true
            lastDot = false
            lastOperator = false
            zeroAfterOperator = false
        }

        back.setOnClickListener {
            if(onScreen.endsWith('.')){
                lastDot = false
                lastDigitNumeric= true
            }
            if(tvInput.text != "0") {
                val str = onScreen.substring(0 , onScreen.length -1)
                onScreen.clear()
                if(str.isNotEmpty()) {
                    onScreen.append(str)
                    tvInput.text = onScreen
                }
                else
                {
                    onScreen.append("0")
                    tvInput.text=onScreen
                }

            }

        }
        dot.setOnClickListener {
            if(lastDigitNumeric && !lastDot){
                onScreen.append(".")
                tvInput.text = onScreen
                lastDot = true
                lastDigitNumeric = false
                zeroAfterOperator = false
            }
        }
        add.setOnClickListener {
            if(lastDigitNumeric)
            {
                onScreen.append("+")
                tvInput.text = onScreen
                lastDigitNumeric = false
                lastOperator= true
                zeroAfterOperator = false
                lastDot = false
            }

        }

        subtract.setOnClickListener {
            if(lastDigitNumeric)
            {
                onScreen.append("-")
                tvInput.text = onScreen
                lastDigitNumeric = false
                lastOperator= true
                zeroAfterOperator = false
                lastDot = false
            }

        }
        multiply.setOnClickListener {
            if(lastDigitNumeric)
            {
                onScreen.append("*")
                tvInput.text = onScreen
                lastDigitNumeric = false
                lastOperator= true
                zeroAfterOperator = false
                lastDot = false
            }

        }
        divide.setOnClickListener {
            if(lastDigitNumeric)
            {
                onScreen.append("/")
                tvInput.text = onScreen
                lastDigitNumeric = false
                lastOperator= true
                zeroAfterOperator = false
                lastDot = false
            }

        }
        equal.setOnClickListener {
            try {
                val expression = ExpressionBuilder(tvInput.text.toString()).build()
                val result = expression.evaluate()
                val longresult = result.toLong()
                if (result == longresult.toDouble()) {
                    tvInput.text = longresult.toString()
                    onScreen.clear()
                    onScreen.append(tvInput.text.toString())
                } else {
                    tvInput.text = result.toString()
                    onScreen.clear()
                    onScreen.append(tvInput.text.toString())
                }
            }
            catch (e:Exception){
                Toast.makeText(this , "Are you trying something fishy? (¬_¬)" , Toast.LENGTH_SHORT).show()
            }


        }
        percent.setOnClickListener {
            if(lastDigitNumeric && !lastDot && !lastOperator){
                onScreen.append("%")
                lastDigitNumeric = false
                lastOperator = true
                tvInput.text = onScreen
            }
        }





    }




}

