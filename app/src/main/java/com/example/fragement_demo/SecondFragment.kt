package com.example.fragement_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {
    private lateinit var secondFragmentText: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_second, container, false)
        initializeComponents(view)

        return view
    }

    private fun initializeComponents(view: View) {
        secondFragmentText = view.findViewById(R.id.secondFragmentText)
    }

    fun setSecondFragmentText(message: String) {
        secondFragmentText.text = message;
    }
}
