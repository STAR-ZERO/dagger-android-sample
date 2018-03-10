package com.example.multimap.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
class MainActivityModule {

    // Key: "GHI", Value: 3
    @Provides
    @IntoMap
    @StringKey("GHI")
    fun provideTwo(): Int {
        return 3
    }
}