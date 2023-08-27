package com.example.fragement_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity(), FirstFragment.SendMessage {

    private lateinit var secondFragment: SecondFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeComponents()
    }

    private fun initializeComponents() {
        setContentView(R.layout.activity_main)
        secondFragment = SecondFragment()
    }

    override fun sendData(message: String) {
        val secondFragment: SecondFragment = supportFragmentManager.findFragmentById(R.id.secondFragment) as SecondFragment
        secondFragment.setSecondFragmentText(message);
    }
}
