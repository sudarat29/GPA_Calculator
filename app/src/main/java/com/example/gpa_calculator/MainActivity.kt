package com.example.gpa_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            var p1 = editTextNumberDecimal1.text.toString()
            var p2 = editTextNumberDecimal2.text.toString()
            var p3 = editTextNumberDecimal3.text.toString()
            var p4 = editTextNumberDecimal4.text.toString()
            var p5 = editTextNumberDecimal5.text.toString()
            var c1 = editTextNumber.text.toString()
            var c2 = editTextNumber2.text.toString()
            var c3 = editTextNumber3.text.toString()
            var c4 = editTextNumber4.text.toString()
            var c5 = editTextNumber5.text.toString()

            if (c1.isEmpty() || c2.isEmpty() || c3.isEmpty() || c4.isEmpty() || c5.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            if (p1.isEmpty() || p2.isEmpty() || p3.isEmpty() || p4.isEmpty() || p5.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            if (editTextTextPersonName.text.isEmpty() || editTextTextPersonName2.text.isEmpty() || editTextTextPersonName3.text.isEmpty() || editTextTextPersonName4.text.isEmpty() || editTextTextPersonName5.text.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input All Text Box Before Press OK !!!", Toast.LENGTH_SHORT).show()

            var total = c1.toInt() + c2.toInt() + c3.toInt() + c4.toInt() + c5.toInt()
            textView16.text = total.toString()

            var sum = 0.0
            sum += (c1.toDouble() * p1.toDouble())
            sum += (c2.toDouble() * p2.toDouble())
            sum += (c3.toDouble() * p3.toDouble())
            sum += (c4.toDouble() * p4.toDouble())
            sum += (c5.toDouble() * p5.toDouble())
            textView17.text = String.format("%.2f", sum / total)
        }
        button2.setOnClickListener {
            editTextNumber.text.clear()
            editTextNumber2.text.clear()
            editTextNumber3.text.clear()
            editTextNumber4.text.clear()
            editTextNumber5.text.clear()
            editTextNumberDecimal1.text.clear()
            editTextNumberDecimal2.text.clear()
            editTextNumberDecimal3.text.clear()
            editTextNumberDecimal4.text.clear()
            editTextNumberDecimal5.text.clear()
            editTextTextPersonName.text.clear()
            editTextTextPersonName2.text.clear()
            editTextTextPersonName3.text.clear()
            editTextTextPersonName4.text.clear()
            editTextTextPersonName5.text.clear()
            textView16.text = ""
            textView17.text = ""
        }
        }

}