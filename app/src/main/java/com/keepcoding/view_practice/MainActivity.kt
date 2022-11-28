package com.keepcoding.view_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStop() {
        Log.d(MainActivity::class.java.simpleName, "OnDestroy")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(MainActivity::class.java.simpleName, "OnRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(MainActivity::class.java.simpleName, "OnDestroy")
        super.onDestroy()
    }
}