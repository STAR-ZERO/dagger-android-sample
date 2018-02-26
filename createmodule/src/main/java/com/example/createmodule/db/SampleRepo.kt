package com.example.createmodule.db

class SampleRepo(private val name: String, private val timestamp: Long): Repo {
    override fun getName(): String {
        return "$name - $timestamp"
    }
}