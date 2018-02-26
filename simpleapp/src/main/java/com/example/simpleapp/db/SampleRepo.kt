package com.example.simpleapp.db

import android.content.Context

class SampleRepo(private val context: Context): Repo {
    override fun getName(): String {
        return "$context"
    }
}