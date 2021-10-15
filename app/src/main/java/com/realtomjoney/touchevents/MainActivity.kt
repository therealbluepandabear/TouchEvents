package com.realtomjoney.touchevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.realtomjoney.touchevents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        myTouch()
    }

    fun myTouch() {
        binding.redView.setOnTouchListener { view, motionEvent ->
            view.performClick()
            when (motionEvent.actionMasked) {
                MotionEvent.ACTION_DOWN -> {
                    Toast.makeText(this, "Red View was touched", Toast.LENGTH_SHORT).show()
                    true
                }
                MotionEvent.ACTION_UP -> {
                    true
                }
                else -> true
            }
        }
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

    private fun setBindings() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}