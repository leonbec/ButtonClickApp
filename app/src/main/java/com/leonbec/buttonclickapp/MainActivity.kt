package com.leonbec.buttonclickapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var times = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = ""
        textView.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener {
            ++times
            textView.append("The btn got tapped $times time")
            if (times != 1)
                textView.append("s")
            textView.append("\n")
        }
    }
}
