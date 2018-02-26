package com.example.createmodule

import android.app.Activity
import android.app.Application
import com.example.createmodule.di.AppModule
import com.example.createmodule.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App: Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
                .appModule(AppModule("AppModule"))
                .timestamp(System.currentTimeMillis())
                .create(this)
                .inject(this)

    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }
}