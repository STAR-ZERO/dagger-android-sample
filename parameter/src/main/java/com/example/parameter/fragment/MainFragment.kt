package com.example.parameter.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MainFragment : Fragment() {

    @Inject
    lateinit var model: MainFragmentModel

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("MainFragment", model.getData())
    }

}