package com.example.simplefragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import com.example.simplefragment.db.Repo
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class SecondFragment: Fragment() {

    @Inject
    lateinit var repo: Repo

    override fun onAttach(context: Context?) {
        // FragmentはonAttachでInjectする

        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("SecondFragment", repo.getName())
    }
}