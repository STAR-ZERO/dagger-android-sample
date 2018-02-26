package com.example.simpleapp.di

import com.example.simpleapp.MainActivity
import com.example.simpleapp.SecondActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    // @ContributesAndroidInjectorでAndroidInjection.inject(this)を可能にする
    // 戻り値の型が対象となるクラス

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeSecondActivity(): SecondActivity
}