package com.example.fragement_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    private lateinit var firstFragmentButton: Button
    private lateinit var firstFragmentEditText: EditText
    private lateinit var mainActivity: SendMessage;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_first, container, false)
        initializeComponents(view)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstFragmentButton.setOnClickListener {
            mainActivity.sendData(firstFragmentEditText.text.toString())
        }
    }

    private fun initializeComponents(view: View) {
        firstFragmentButton = view.findViewById(R.id.firstFragmentButton)
        firstFragmentEditText = view.findViewById(R.id.firstFragmentEditText)

        try {
            mainActivity = activity as SendMessage
        } catch (e: ClassCastException) {
            throw ClassCastException("Error in retrieving data. Please try again")
        }
    }

    interface SendMessage {
        fun sendData(message: String)
    }
}
