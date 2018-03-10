package com.example.multimap.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
class AppModule {

    // @IntoMapと@StringKeyがMapの要素としてInjectされる
    // Key: "ABC", Value: 1
    @Provides
    @IntoMap
    @StringKey("ABC")
    fun provideOne(): Int {
        return 1
    }

    // Key: "DEF", Value: 2
    @Provides
    @IntoMap
    @StringKey("DEF")
    fun provideTwo(): Int {
        return 2
    }
}
