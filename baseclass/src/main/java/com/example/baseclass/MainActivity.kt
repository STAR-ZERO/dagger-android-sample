package com.example.baseclass

import android.os.Bundle
import android.util.Log
import com.example.baseclass.db.Repo
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var repo: Repo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", repo.getName())
    }
}
