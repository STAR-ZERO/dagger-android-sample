package com.example.simplefragment.di

import com.example.simplefragment.FirstFragment
import com.example.simplefragment.SecondFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    // Activityと同様に@ContributesAndroidInjectorを定義する

    @ContributesAndroidInjector
    abstract fun contributeFirstFragment(): FirstFragment

    @ContributesAndroidInjector
    abstract fun contributeSecondFragment(): SecondFragment
}