package com.example.createmodule

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.createmodule.db.Repo
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repo: Repo

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", repo.getName())
    }
}
