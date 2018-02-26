package com.example.parameter.activity

import android.app.Activity
import android.support.v4.app.FragmentManager
import javax.inject.Inject

class MainModel @Inject constructor(
        private val activity: Activity,
        private val fragmentManager: FragmentManager) {

    fun getData(): String {
        return "MainModel - $activity - $fragmentManager"
    }
}