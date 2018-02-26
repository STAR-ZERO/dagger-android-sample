package com.example.simpleapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.simpleapp.db.Repo
import dagger.android.AndroidInjection
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var repo: Repo

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("SecondActivity", repo.getName())
    }
}
