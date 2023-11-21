package com.example.tddhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tddhelloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    var state:Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            viewBinding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(viewBinding.root)

        viewBinding.textView.text = state.toString()

        viewBinding.button2.setOnClickListener{
            state++
            viewBinding.textView.text = state.toString()
        }

    }
}