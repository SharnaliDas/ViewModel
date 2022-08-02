package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() , LifecycleOwner, View.OnClickListener {
    lateinit var mButton: Button
    lateinit var mTextView: TextView
    var number: Int = 0
    lateinit var viewModel:MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton = findViewById(R.id.button)
        mTextView = findViewById(R.id.textView3)

         viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        mTextView.setText(viewModel.number.toString())
        mButton.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {
        viewModel.addNumber()
        mTextView.setText(viewModel.number.toString())
       // number++
            //number.toString())
    }
}