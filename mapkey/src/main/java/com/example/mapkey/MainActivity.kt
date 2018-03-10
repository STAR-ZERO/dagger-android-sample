package com.example.mapkey

import android.os.Bundle
import android.util.Log
import com.example.mapkey.di.MyColor
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var map: Map<MyColor, String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // {RED=赤, GREEN=緑} が表示される
        Log.d("MainActivity", "$map")
    }
}
