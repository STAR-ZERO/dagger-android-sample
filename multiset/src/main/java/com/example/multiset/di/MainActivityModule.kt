package com.example.multiset.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class MainActivityModule {

    @Provides
    @IntoSet
    fun provideActivityString(): String {
        return "JKL"
    }
}