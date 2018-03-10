package com.example.multimap

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var map: Map<String, Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // {ABC=1, DEF=2, GHI=3} が表示される
        //   ABC=1, DEF=2 はAppModuleで定義
        //   GHI=3 はMainActivityModuleで定義
        Log.d("MainActivity", "$map")
    }
}
