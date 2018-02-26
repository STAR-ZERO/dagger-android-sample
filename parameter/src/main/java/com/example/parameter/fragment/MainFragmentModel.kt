package com.example.parameter.fragment

import android.app.Activity
import android.support.v4.app.Fragment
import javax.inject.Inject

class MainFragmentModel @Inject constructor(private val activity: Activity, private val fragment: Fragment) {
    fun getData(): String {
        return "MainFragmentModel - $activity - $fragment"
    }
}
