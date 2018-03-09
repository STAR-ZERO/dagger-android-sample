package com.example.multiset

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var values: Set<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // [ABC, DEF, GHI, JKL] が表示される
        //   ABC, DEF, GHI はAppModuleで定義
        //   JKL はMainActivityModuleで定義
        Log.d("MainActivity", "$values")
    }
}
