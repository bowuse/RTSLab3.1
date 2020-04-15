package com.example.srtlab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onFactorizeClick(view: View){
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)

        val nString = inputNumber.text.toString()
        val n = Integer.parseInt(nString)

        val result = factorize(n)

        resultNumber.setText(getString(R.string.result, n, result.first, result.second))
    }
}
