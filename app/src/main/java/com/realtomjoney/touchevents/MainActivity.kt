package com.realtomjoney.touchevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val action = event!!.actionMasked

        return when (action) {
            MotionEvent.ACTION_DOWN -> {
                true
            }
            MotionEvent.ACTION_CANCEL -> {
                true
            }
            MotionEvent.ACTION_MOVE -> {
                true
            }
            MotionEvent.ACTION_UP -> {
                Toast.makeText(this, "Touch is lifted", Toast.LENGTH_SHORT)
                    .show()
                true
            }
            else -> super.onTouchEvent(event)
        }
    }
}