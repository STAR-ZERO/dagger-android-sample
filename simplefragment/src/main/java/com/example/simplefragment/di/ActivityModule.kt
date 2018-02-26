package com.example.simplefragment.di

import com.example.simplefragment.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    // modules引数にMainActivityModuleを指定する
    //   SubComponentとして扱われる
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun contributeMainActivity(): MainActivity
}